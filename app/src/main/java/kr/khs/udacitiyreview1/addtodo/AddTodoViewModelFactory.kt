package kr.khs.udacitiyreview1.addtodo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kr.khs.udacitiyreview1.database.TodoDao

class AddTodoViewModelFactory(private val addOrUpdate : Long, private val database : TodoDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AddTodoViewModel::class.java))
            return AddTodoViewModel(addOrUpdate, database) as T

        throw IllegalArgumentException("Unknown Class")
    }

}