package kr.khs.udacitiyreview1.addtodo;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import kr.khs.udacitiyreview1.R;

public class AddTodoFragmentDirections {
  private AddTodoFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionAddTodoFragmentToTodoListFragment() {
    return new ActionOnlyNavDirections(R.id.action_addTodoFragment_to_todoListFragment);
  }
}
