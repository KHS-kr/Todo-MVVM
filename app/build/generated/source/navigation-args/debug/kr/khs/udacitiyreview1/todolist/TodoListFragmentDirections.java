package kr.khs.udacitiyreview1.todolist;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import kr.khs.udacitiyreview1.R;

public class TodoListFragmentDirections {
  private TodoListFragmentDirections() {
  }

  @NonNull
  public static ActionTodoListFragmentToAddTodoFragment actionTodoListFragmentToAddTodoFragment(
      long addOrUpdate) {
    return new ActionTodoListFragmentToAddTodoFragment(addOrUpdate);
  }

  public static class ActionTodoListFragmentToAddTodoFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTodoListFragmentToAddTodoFragment(long addOrUpdate) {
      this.arguments.put("addOrUpdate", addOrUpdate);
    }

    @NonNull
    public ActionTodoListFragmentToAddTodoFragment setAddOrUpdate(long addOrUpdate) {
      this.arguments.put("addOrUpdate", addOrUpdate);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("addOrUpdate")) {
        long addOrUpdate = (long) arguments.get("addOrUpdate");
        __result.putLong("addOrUpdate", addOrUpdate);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_todoListFragment_to_addTodoFragment;
    }

    @SuppressWarnings("unchecked")
    public long getAddOrUpdate() {
      return (long) arguments.get("addOrUpdate");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTodoListFragmentToAddTodoFragment that = (ActionTodoListFragmentToAddTodoFragment) object;
      if (arguments.containsKey("addOrUpdate") != that.arguments.containsKey("addOrUpdate")) {
        return false;
      }
      if (getAddOrUpdate() != that.getAddOrUpdate()) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (int)(getAddOrUpdate() ^ (getAddOrUpdate() >>> 32));
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTodoListFragmentToAddTodoFragment(actionId=" + getActionId() + "){"
          + "addOrUpdate=" + getAddOrUpdate()
          + "}";
    }
  }
}
