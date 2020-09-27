package kr.khs.udacitiyreview1.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TodoDao_Impl implements TodoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TodoItem> __insertionAdapterOfTodoItem;

  private final EntityDeletionOrUpdateAdapter<TodoItem> __updateAdapterOfTodoItem;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public TodoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTodoItem = new EntityInsertionAdapter<TodoItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `todo_table` (`seq`,`what_to_do`,`timestamp`,`is_done`,`done_time`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoItem value) {
        stmt.bindLong(1, value.getSeq());
        if (value.getWhatToDo() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWhatToDo());
        }
        stmt.bindLong(3, value.getTime());
        final int _tmp;
        _tmp = value.isDone() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getDoneTime());
      }
    };
    this.__updateAdapterOfTodoItem = new EntityDeletionOrUpdateAdapter<TodoItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `todo_table` SET `seq` = ?,`what_to_do` = ?,`timestamp` = ?,`is_done` = ?,`done_time` = ? WHERE `seq` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TodoItem value) {
        stmt.bindLong(1, value.getSeq());
        if (value.getWhatToDo() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWhatToDo());
        }
        stmt.bindLong(3, value.getTime());
        final int _tmp;
        _tmp = value.isDone() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        stmt.bindLong(5, value.getDoneTime());
        stmt.bindLong(6, value.getSeq());
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM todo_table WHERE seq = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM todo_table";
        return _query;
      }
    };
  }

  @Override
  public void insert(final TodoItem todo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTodoItem.insert(todo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final TodoItem todo) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfTodoItem.handle(todo);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final long key) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, key);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public TodoItem get(final long key) {
    final String _sql = "SELECT * FROM todo_table WHERE seq = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, key);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSeq = CursorUtil.getColumnIndexOrThrow(_cursor, "seq");
      final int _cursorIndexOfWhatToDo = CursorUtil.getColumnIndexOrThrow(_cursor, "what_to_do");
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfIsDone = CursorUtil.getColumnIndexOrThrow(_cursor, "is_done");
      final int _cursorIndexOfDoneTime = CursorUtil.getColumnIndexOrThrow(_cursor, "done_time");
      final TodoItem _result;
      if(_cursor.moveToFirst()) {
        final long _tmpSeq;
        _tmpSeq = _cursor.getLong(_cursorIndexOfSeq);
        final String _tmpWhatToDo;
        _tmpWhatToDo = _cursor.getString(_cursorIndexOfWhatToDo);
        final long _tmpTime;
        _tmpTime = _cursor.getLong(_cursorIndexOfTime);
        final boolean _tmpIsDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfIsDone);
        _tmpIsDone = _tmp != 0;
        final long _tmpDoneTime;
        _tmpDoneTime = _cursor.getLong(_cursorIndexOfDoneTime);
        _result = new TodoItem(_tmpSeq,_tmpWhatToDo,_tmpTime,_tmpIsDone,_tmpDoneTime);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<TodoItem>> getAll() {
    final String _sql = "SELECT * FROM todo_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"todo_table"}, false, new Callable<List<TodoItem>>() {
      @Override
      public List<TodoItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSeq = CursorUtil.getColumnIndexOrThrow(_cursor, "seq");
          final int _cursorIndexOfWhatToDo = CursorUtil.getColumnIndexOrThrow(_cursor, "what_to_do");
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfIsDone = CursorUtil.getColumnIndexOrThrow(_cursor, "is_done");
          final int _cursorIndexOfDoneTime = CursorUtil.getColumnIndexOrThrow(_cursor, "done_time");
          final List<TodoItem> _result = new ArrayList<TodoItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final TodoItem _item;
            final long _tmpSeq;
            _tmpSeq = _cursor.getLong(_cursorIndexOfSeq);
            final String _tmpWhatToDo;
            _tmpWhatToDo = _cursor.getString(_cursorIndexOfWhatToDo);
            final long _tmpTime;
            _tmpTime = _cursor.getLong(_cursorIndexOfTime);
            final boolean _tmpIsDone;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsDone);
            _tmpIsDone = _tmp != 0;
            final long _tmpDoneTime;
            _tmpDoneTime = _cursor.getLong(_cursorIndexOfDoneTime);
            _item = new TodoItem(_tmpSeq,_tmpWhatToDo,_tmpTime,_tmpIsDone,_tmpDoneTime);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
