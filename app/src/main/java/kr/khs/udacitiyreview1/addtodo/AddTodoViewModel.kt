package kr.khs.udacitiyreview1.addtodo

import android.util.Log
import android.widget.Toast
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import kr.khs.udacitiyreview1.ITEM_ADD
import kr.khs.udacitiyreview1.ITEM_UPDATE
import kr.khs.udacitiyreview1.database.TodoDao
import kr.khs.udacitiyreview1.database.TodoItem

class AddTodoViewModel(val addOrUpdate : Long, val database : TodoDao) : ViewModel() {

    val viewModelJob = Job()

    val dbScope = CoroutineScope(Dispatchers.IO)

    val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val newTodo = ObservableField<String>()

    private val _updateItem = MutableLiveData<TodoItem>()

    private val _addOrUpdateComplete = MutableLiveData<Boolean>()
    val addOrUpdateComplete : LiveData<Boolean>
        get() = _addOrUpdateComplete

    private fun doneAddOrUpdateComplete() {
        _addOrUpdateComplete.value = true
    }

    private suspend fun get(seq : Long) : TodoItem {
        return withContext(Dispatchers.IO) {
            database.get(seq)
        }
    }

    fun getUpdateItem(seq : Long) {
        uiScope.launch {
            _updateItem.value = get(seq)
            newTodo.set(_updateItem.value?.whatToDo)
        }
    }

    private fun insert(item : TodoItem) {
        Log.d("ADDTODOVIEWMODEL", "insert")
        dbScope.launch {
            database.insert(item)
        }
    }

    private fun update(item : TodoItem) {
        Log.d("ADDTODOVIEWMODEL", "update")
        item.isDone = false
        item.doneTime = item.time
        dbScope.launch {
            database.update(item)
        }
    }

    fun actionAddOrUpdate() {
        uiScope.launch {
            if (newTodo.get() != null) {
                var item = TodoItem(whatToDo = newTodo.get()!!)

                Log.d("ADDTODOVIEWMODEL", item.toString())
                when (addOrUpdate) {
                    ITEM_ADD.toLong() -> insert(item)
                    else -> {
                        item = _updateItem.value!!
                        item.whatToDo = newTodo.get()!!
                        update(item)
                    }
                }
                doneAddOrUpdateComplete()
            }
        }
    }

    override fun onCleared() {
        dbScope.cancel()
        uiScope.cancel()
    }
}