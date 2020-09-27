package kr.khs.udacitiyreview1.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lkr/khs/udacitiyreview1/todolist/TodoListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lkr/khs/udacitiyreview1/database/TodoItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "checkListener", "Lkr/khs/udacitiyreview1/todolist/TodoItemCheckListener;", "clickListener", "Lkr/khs/udacitiyreview1/todolist/TodoItemClickListener;", "(Lkr/khs/udacitiyreview1/todolist/TodoItemCheckListener;Lkr/khs/udacitiyreview1/todolist/TodoItemClickListener;)V", "getCheckListener", "()Lkr/khs/udacitiyreview1/todolist/TodoItemCheckListener;", "getClickListener", "()Lkr/khs/udacitiyreview1/todolist/TodoItemClickListener;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TodoViewHolder", "app_debug"})
public final class TodoListAdapter extends androidx.recyclerview.widget.ListAdapter<kr.khs.udacitiyreview1.database.TodoItem, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kr.khs.udacitiyreview1.todolist.TodoItemCheckListener checkListener = null;
    @org.jetbrains.annotations.NotNull()
    private final kr.khs.udacitiyreview1.todolist.TodoItemClickListener clickListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.khs.udacitiyreview1.todolist.TodoItemCheckListener getCheckListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.khs.udacitiyreview1.todolist.TodoItemClickListener getClickListener() {
        return null;
    }
    
    public TodoListAdapter(@org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.todolist.TodoItemCheckListener checkListener, @org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.todolist.TodoItemClickListener clickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lkr/khs/udacitiyreview1/todolist/TodoListAdapter$TodoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lkr/khs/udacitiyreview1/databinding/ItemTodoListBinding;", "(Lkr/khs/udacitiyreview1/databinding/ItemTodoListBinding;)V", "getBinding", "()Lkr/khs/udacitiyreview1/databinding/ItemTodoListBinding;", "bind", "", "todoItem", "Lkr/khs/udacitiyreview1/database/TodoItem;", "checkListener", "Lkr/khs/udacitiyreview1/todolist/TodoItemCheckListener;", "clickListener", "Lkr/khs/udacitiyreview1/todolist/TodoItemClickListener;", "Companion", "app_debug"})
    public static final class TodoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final kr.khs.udacitiyreview1.databinding.ItemTodoListBinding binding = null;
        public static final kr.khs.udacitiyreview1.todolist.TodoListAdapter.TodoViewHolder.Companion Companion = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        kr.khs.udacitiyreview1.database.TodoItem todoItem, @org.jetbrains.annotations.NotNull()
        kr.khs.udacitiyreview1.todolist.TodoItemCheckListener checkListener, @org.jetbrains.annotations.NotNull()
        kr.khs.udacitiyreview1.todolist.TodoItemClickListener clickListener) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kr.khs.udacitiyreview1.databinding.ItemTodoListBinding getBinding() {
            return null;
        }
        
        private TodoViewHolder(kr.khs.udacitiyreview1.databinding.ItemTodoListBinding binding) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkr/khs/udacitiyreview1/todolist/TodoListAdapter$TodoViewHolder$Companion;", "", "()V", "from", "Lkr/khs/udacitiyreview1/todolist/TodoListAdapter$TodoViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final kr.khs.udacitiyreview1.todolist.TodoListAdapter.TodoViewHolder from(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}