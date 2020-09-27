package kr.khs.udacitiyreview1.todolist

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.*
import kr.khs.udacitiyreview1.ITEM_ADD
import kr.khs.udacitiyreview1.database.TodoDao

class TodoListViewModel(val database : TodoDao, application : Application) : AndroidViewModel(application) {

    val viewModelJob = Job()

    val uiScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    val dbScope = CoroutineScope(Dispatchers.IO)

    val todoThings = database.getAll()

    private val _navigateToAddOrUpdate = MutableLiveData<Long>()
    val navigateToAddOrUpdate : LiveData<Long>
        get() = _navigateToAddOrUpdate

    fun onAddTodoClicked() {
        _navigateToAddOrUpdate.value = ITEM_ADD.toLong()
    }

    fun onUpdateTodoClicked(seq : Long) {
        _navigateToAddOrUpdate.value = seq
    }

    fun doneNavigateToAddOrUpdate() {
        _navigateToAddOrUpdate.value = -1
    }

    fun onTodoItemOnChecked(seq : Long) {
        uiScope.launch {
            Log.d("UPDATE_CHECKED", "$seq")
            updateChecked(seq)
        }
    }

    private fun updateChecked(seq : Long) {
        dbScope.launch {
            val updateItem = database.get(seq)
            Log.d("UPDATE_CHECKED", updateItem.toString())
            updateItem.isDone = !updateItem.isDone
            updateItem.doneTime = if(updateItem.isDone) System.currentTimeMillis() else updateItem.time

            Log.d("UPDATE_CHECKED", updateItem.toString())
            database.update(updateItem)
        }
    }

    override fun onCleared() {
        uiScope.cancel()
        dbScope.cancel()
    }
}