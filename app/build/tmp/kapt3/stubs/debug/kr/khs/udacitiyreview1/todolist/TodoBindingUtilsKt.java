package kr.khs.udacitiyreview1.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\b"}, d2 = {"setIsChecked", "", "Landroid/widget/CheckBox;", "item", "Lkr/khs/udacitiyreview1/database/TodoItem;", "setTimestampFormatted", "Landroid/widget/TextView;", "setWhatTodo", "app_debug"})
public final class TodoBindingUtilsKt {
    
    @androidx.databinding.BindingAdapter(value = {"timestampFormatted"})
    public static final void setTimestampFormatted(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTimestampFormatted, @org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.database.TodoItem item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"todoFormatted"})
    public static final void setWhatTodo(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setWhatTodo, @org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.database.TodoItem item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"checkFormatted"})
    public static final void setIsChecked(@org.jetbrains.annotations.NotNull()
    android.widget.CheckBox $this$setIsChecked, @org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.database.TodoItem item) {
    }
}