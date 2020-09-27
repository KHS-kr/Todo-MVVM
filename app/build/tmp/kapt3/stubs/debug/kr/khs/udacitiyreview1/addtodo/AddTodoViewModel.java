package kr.khs.udacitiyreview1.addtodo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020$H\u0002J\u0019\u0010&\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020$2\u0006\u0010\'\u001a\u00020\u0003J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u000bH\u0002J\b\u0010,\u001a\u00020$H\u0014J\u0010\u0010-\u001a\u00020$2\u0006\u0010+\u001a\u00020\u000bH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u001f\u001a\u00020 \u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006."}, d2 = {"Lkr/khs/udacitiyreview1/addtodo/AddTodoViewModel;", "Landroidx/lifecycle/ViewModel;", "addOrUpdate", "", "database", "Lkr/khs/udacitiyreview1/database/TodoDao;", "(JLkr/khs/udacitiyreview1/database/TodoDao;)V", "_addOrUpdateComplete", "Landroidx/lifecycle/MutableLiveData;", "", "_updateItem", "Lkr/khs/udacitiyreview1/database/TodoItem;", "getAddOrUpdate", "()J", "addOrUpdateComplete", "Landroidx/lifecycle/LiveData;", "getAddOrUpdateComplete", "()Landroidx/lifecycle/LiveData;", "getDatabase", "()Lkr/khs/udacitiyreview1/database/TodoDao;", "dbScope", "Lkotlinx/coroutines/CoroutineScope;", "getDbScope", "()Lkotlinx/coroutines/CoroutineScope;", "newTodo", "Landroidx/databinding/ObservableField;", "", "getNewTodo", "()Landroidx/databinding/ObservableField;", "uiScope", "getUiScope", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "getViewModelJob", "()Lkotlinx/coroutines/CompletableJob;", "actionAddOrUpdate", "", "doneAddOrUpdateComplete", "get", "seq", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUpdateItem", "insert", "item", "onCleared", "update", "app_debug"})
public final class AddTodoViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CompletableJob viewModelJob = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope dbScope = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.databinding.ObservableField<java.lang.String> newTodo = null;
    private final androidx.lifecycle.MutableLiveData<kr.khs.udacitiyreview1.database.TodoItem> _updateItem = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _addOrUpdateComplete = null;
    private final long addOrUpdate = 0L;
    @org.jetbrains.annotations.NotNull()
    private final kr.khs.udacitiyreview1.database.TodoDao database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CompletableJob getViewModelJob() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getDbScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getUiScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getNewTodo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getAddOrUpdateComplete() {
        return null;
    }
    
    private final void doneAddOrUpdateComplete() {
    }
    
    public final void getUpdateItem(long seq) {
    }
    
    private final void insert(kr.khs.udacitiyreview1.database.TodoItem item) {
    }
    
    private final void update(kr.khs.udacitiyreview1.database.TodoItem item) {
    }
    
    public final void actionAddOrUpdate() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final long getAddOrUpdate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.khs.udacitiyreview1.database.TodoDao getDatabase() {
        return null;
    }
    
    public AddTodoViewModel(long addOrUpdate, @org.jetbrains.annotations.NotNull()
    kr.khs.udacitiyreview1.database.TodoDao database) {
        super();
    }
}