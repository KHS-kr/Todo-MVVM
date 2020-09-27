package kr.khs.udacitiyreview1.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b0\nH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH\'\u00a8\u0006\u000f"}, d2 = {"Lkr/khs/udacitiyreview1/database/TodoDao;", "", "delete", "", "key", "", "deleteAll", "get", "Lkr/khs/udacitiyreview1/database/TodoItem;", "getAll", "Landroidx/lifecycle/LiveData;", "", "insert", "todo", "update", "app_debug"})
public abstract interface TodoDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.database.TodoItem todo);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.database.TodoItem todo);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todo_table WHERE seq = :key")
    public abstract kr.khs.udacitiyreview1.database.TodoItem get(long key);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM todo_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<kr.khs.udacitiyreview1.database.TodoItem>> getAll();
    
    @androidx.room.Query(value = "DELETE FROM todo_table WHERE seq = :key")
    public abstract void delete(long key);
    
    @androidx.room.Query(value = "DELETE FROM todo_table")
    public abstract void deleteAll();
}