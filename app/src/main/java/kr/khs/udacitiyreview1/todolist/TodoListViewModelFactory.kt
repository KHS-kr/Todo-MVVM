package kr.khs.udacitiyreview1.todolist

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kr.khs.udacitiyreview1.database.TodoDao

class TodoListViewModelFactory(
    private val database : TodoDao,
    private val application : Application
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(TodoListViewModel::class.java))
            return TodoListViewModel(database, application) as T
        throw IllegalArgumentException("Unknown Class Exception")
    }

}