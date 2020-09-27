package kr.khs.udacitiyreview1.addtodo;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class AddTodoFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private AddTodoFragmentArgs() {
  }

  private AddTodoFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static AddTodoFragmentArgs fromBundle(@NonNull Bundle bundle) {
    AddTodoFragmentArgs __result = new AddTodoFragmentArgs();
    bundle.setClassLoader(AddTodoFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("addOrUpdate")) {
      long addOrUpdate;
      addOrUpdate = bundle.getLong("addOrUpdate");
      __result.arguments.put("addOrUpdate", addOrUpdate);
    } else {
      throw new IllegalArgumentException("Required argument \"addOrUpdate\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public long getAddOrUpdate() {
    return (long) arguments.get("addOrUpdate");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("addOrUpdate")) {
      long addOrUpdate = (long) arguments.get("addOrUpdate");
      __result.putLong("addOrUpdate", addOrUpdate);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    AddTodoFragmentArgs that = (AddTodoFragmentArgs) object;
    if (arguments.containsKey("addOrUpdate") != that.arguments.containsKey("addOrUpdate")) {
      return false;
    }
    if (getAddOrUpdate() != that.getAddOrUpdate()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (int)(getAddOrUpdate() ^ (getAddOrUpdate() >>> 32));
    return result;
  }

  @Override
  public String toString() {
    return "AddTodoFragmentArgs{"
        + "addOrUpdate=" + getAddOrUpdate()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(AddTodoFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(long addOrUpdate) {
      this.arguments.put("addOrUpdate", addOrUpdate);
    }

    @NonNull
    public AddTodoFragmentArgs build() {
      AddTodoFragmentArgs result = new AddTodoFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setAddOrUpdate(long addOrUpdate) {
      this.arguments.put("addOrUpdate", addOrUpdate);
      return this;
    }

    @SuppressWarnings("unchecked")
    public long getAddOrUpdate() {
      return (long) arguments.get("addOrUpdate");
    }
  }
}
