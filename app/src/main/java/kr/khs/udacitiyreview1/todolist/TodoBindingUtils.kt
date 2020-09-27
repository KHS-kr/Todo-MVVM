package kr.khs.udacitiyreview1.todolist

import android.widget.CheckBox
import android.widget.TextView
import androidx.databinding.BindingAdapter
import kr.khs.udacitiyreview1.database.TodoItem

@BindingAdapter("timestampFormatted")
fun TextView.setTimestampFormatted(item : TodoItem) {
    item?.let {
        text = "${it.time}" + if(it.isDone) " - ${it.doneTime}" else ""
    }
}

@BindingAdapter("todoFormatted")
fun TextView.setWhatTodo(item : TodoItem) {
    item?.let {
        text = it.whatToDo
    }
}

@BindingAdapter("checkFormatted")
fun CheckBox.setIsChecked(item : TodoItem) {
    item?.let {
        isChecked = it.isDone
    }
}