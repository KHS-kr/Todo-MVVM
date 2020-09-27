package kr.khs.udacitiyreview1.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo_table")
data class TodoItem(
    @PrimaryKey(autoGenerate = true)
    val seq : Long = 0,

    @ColumnInfo(name = "what_to_do")
    var whatToDo : String = "",

    @ColumnInfo(name = "timestamp")
    val time : Long = System.currentTimeMillis(),

    @ColumnInfo(name = "is_done")
    var isDone : Boolean = false,

    @ColumnInfo(name = "done_time")
    var doneTime : Long = time
)