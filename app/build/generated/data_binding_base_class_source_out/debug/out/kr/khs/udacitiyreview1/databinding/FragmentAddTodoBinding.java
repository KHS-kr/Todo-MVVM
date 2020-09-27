// Generated by data binding compiler. Do not edit!
package kr.khs.udacitiyreview1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.Deprecated;
import java.lang.Object;
import kr.khs.udacitiyreview1.R;
import kr.khs.udacitiyreview1.addtodo.AddTodoViewModel;

public abstract class FragmentAddTodoBinding extends ViewDataBinding {
  @NonNull
  public final EditText etWhattodo;

  @NonNull
  public final FloatingActionButton floatingActionButton;

  @Bindable
  protected AddTodoViewModel mViewModel;

  protected FragmentAddTodoBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText etWhattodo, FloatingActionButton floatingActionButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etWhattodo = etWhattodo;
    this.floatingActionButton = floatingActionButton;
  }

  public abstract void setViewModel(@Nullable AddTodoViewModel viewModel);

  @Nullable
  public AddTodoViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentAddTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_todo, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAddTodoBinding>inflateInternal(inflater, R.layout.fragment_add_todo, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAddTodoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_add_todo, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAddTodoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAddTodoBinding>inflateInternal(inflater, R.layout.fragment_add_todo, null, false, component);
  }

  public static FragmentAddTodoBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentAddTodoBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAddTodoBinding)bind(component, view, R.layout.fragment_add_todo);
  }
}