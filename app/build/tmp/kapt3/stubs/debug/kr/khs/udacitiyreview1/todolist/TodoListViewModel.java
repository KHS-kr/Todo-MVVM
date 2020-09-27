package kr.khs.udacitiyreview1.todolist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0014J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\tJ\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\tJ\u0010\u0010%\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\tH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006&"}, d2 = {"Lkr/khs/udacitiyreview1/todolist/TodoListViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lkr/khs/udacitiyreview1/database/TodoDao;", "application", "Landroid/app/Application;", "(Lkr/khs/udacitiyreview1/database/TodoDao;Landroid/app/Application;)V", "_navigateToAddOrUpdate", "Landroidx/lifecycle/MutableLiveData;", "", "getDatabase", "()Lkr/khs/udacitiyreview1/database/TodoDao;", "dbScope", "Lkotlinx/coroutines/CoroutineScope;", "getDbScope", "()Lkotlinx/coroutines/CoroutineScope;", "navigateToAddOrUpdate", "Landroidx/lifecycle/LiveData;", "getNavigateToAddOrUpdate", "()Landroidx/lifecycle/LiveData;", "todoThings", "", "Lkr/khs/udacitiyreview1/database/TodoItem;", "getTodoThings", "uiScope", "getUiScope", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "getViewModelJob", "()Lkotlinx/coroutines/CompletableJob;", "doneNavigateToAddOrUpdate", "", "onAddTodoClicked", "onCleared", "onTodoItemOnChecked", "seq", "onUpdateTodoClicked", "updateChecked", "app_debug"})
public final class TodoListViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope dbScope = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<kr.khs.udacitiyreview1.database.TodoItem>> todoThings = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> _navigateToAddOrUpdate = null;
    @org.jetbrains.annotations.NotNull()
    private final kr.khs.udacitiyreview1.database.TodoDao database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CompletableJob getViewModelJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getUiScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getDbScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<kr.khs.udacitiyreview1.database.TodoItem>> getTodoThings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getNavigateToAddOrUpdate() {
        return null;
    }
    
    public final void onAddTodoClicked() {
    }
    
    public final void onUpdateTodoClicked(long seq) {
    }
    
    public final void doneNavigateToAddOrUpdate() {
    }
    
    public final void onTodoItemOnChecked(long seq) {
    }
    
    private final void updateChecked(long seq) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.khs.udacitiyreview1.database.TodoDao getDatabase() {
        return null;
    }
    
    public TodoListViewModel(@org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.database.TodoDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}