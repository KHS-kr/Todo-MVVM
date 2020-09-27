package kr.khs.udacitiyreview1.databinding;
import kr.khs.udacitiyreview1.R;
import kr.khs.udacitiyreview1.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTodoListBindingImpl extends ItemTodoListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTodoListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemTodoListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.itemCl.setTag(null);
        this.itemIsdone.setTag(null);
        this.itemTimestamp.setTag(null);
        this.itemWhattodo.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.clickListener == variableId) {
            setClickListener((kr.khs.udacitiyreview1.todolist.TodoItemClickListener) variable);
        }
        else if (BR.item == variableId) {
            setItem((kr.khs.udacitiyreview1.database.TodoItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable kr.khs.udacitiyreview1.todolist.TodoItemClickListener ClickListener) {
        this.mClickListener = ClickListener;
    }
    public void setItem(@Nullable kr.khs.udacitiyreview1.database.TodoItem Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        kr.khs.udacitiyreview1.database.TodoItem item = mItem;

        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            kr.khs.udacitiyreview1.todolist.TodoBindingUtilsKt.setIsChecked(this.itemIsdone, item);
            kr.khs.udacitiyreview1.todolist.TodoBindingUtilsKt.setTimestampFormatted(this.itemTimestamp, item);
            kr.khs.udacitiyreview1.todolist.TodoBindingUtilsKt.setWhatTodo(this.itemWhattodo, item);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): item
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}