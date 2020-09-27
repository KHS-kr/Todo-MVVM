package kr.khs.udacitiyreview1;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kr.khs.udacitiyreview1.databinding.FragmentAddTodoBindingImpl;
import kr.khs.udacitiyreview1.databinding.FragmentTodoListBindingImpl;
import kr.khs.udacitiyreview1.databinding.ItemTodoListBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTADDTODO = 1;

  private static final int LAYOUT_FRAGMENTTODOLIST = 2;

  private static final int LAYOUT_ITEMTODOLIST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.khs.udacitiyreview1.R.layout.fragment_add_todo, LAYOUT_FRAGMENTADDTODO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.khs.udacitiyreview1.R.layout.fragment_todo_list, LAYOUT_FRAGMENTTODOLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.khs.udacitiyreview1.R.layout.item_todo_list, LAYOUT_ITEMTODOLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTADDTODO: {
          if ("layout/fragment_add_todo_0".equals(tag)) {
            return new FragmentAddTodoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_add_todo is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTODOLIST: {
          if ("layout/fragment_todo_list_0".equals(tag)) {
            return new FragmentTodoListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_todo_list is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTODOLIST: {
          if ("layout/item_todo_list_0".equals(tag)) {
            return new ItemTodoListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_todo_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "item");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_add_todo_0", kr.khs.udacitiyreview1.R.layout.fragment_add_todo);
      sKeys.put("layout/fragment_todo_list_0", kr.khs.udacitiyreview1.R.layout.fragment_todo_list);
      sKeys.put("layout/item_todo_list_0", kr.khs.udacitiyreview1.R.layout.item_todo_list);
    }
  }
}
