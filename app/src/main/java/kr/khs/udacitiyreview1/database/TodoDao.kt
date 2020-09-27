package kr.khs.udacitiyreview1.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TodoDao {
    @Insert
    fun insert(todo : TodoItem)

    @Update
    fun update(todo : TodoItem)

    @Query("SELECT * FROM todo_table WHERE seq = :key")
    fun get(key : Long) : TodoItem

    @Query("SELECT * FROM todo_table")
    fun getAll() : LiveData<List<TodoItem>>

    @Query("DELETE FROM todo_table WHERE seq = :key")
    fun delete(key : Long)

    @Query("DELETE FROM todo_table")
    fun deleteAll()
}