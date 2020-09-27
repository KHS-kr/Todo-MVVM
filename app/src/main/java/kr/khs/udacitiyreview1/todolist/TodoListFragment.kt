package kr.khs.udacitiyreview1.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kr.khs.udacitiyreview1.ITEM_ADD
import kr.khs.udacitiyreview1.database.TodoDatabase
import kr.khs.udacitiyreview1.R
import kr.khs.udacitiyreview1.databinding.FragmentTodoListBinding

class TodoListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentTodoListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_todo_list, container, false
        )

        val application = requireNotNull(this.activity).application

        val database = TodoDatabase.getInstance(application).todoDao

        val viewModelFactory = TodoListViewModelFactory(database, application)

        val viewModel = ViewModelProvider(this, viewModelFactory).get(TodoListViewModel::class.java)

        binding.viewModel = viewModel

        binding.lifecycleOwner = this

        val adapter = TodoListAdapter(TodoItemCheckListener { seq ->
            viewModel.onTodoItemOnChecked(seq)
        },
        TodoItemClickListener { seq ->
            viewModel.onUpdateTodoClicked(seq)
        })

        binding.rvTodoList.adapter = adapter

        viewModel.todoThings.observe(viewLifecycleOwner, Observer {
            adapter.submitList(it)
        })

        viewModel.navigateToAddOrUpdate.observe(viewLifecycleOwner, Observer {
            if(it != -1L) {
                this.findNavController()
                    .navigate(TodoListFragmentDirections.actionTodoListFragmentToAddTodoFragment(
                        it // ITEM_ADD = 0, else : seq
                    ))
                viewModel.doneNavigateToAddOrUpdate()
            }
        })

        return binding.root
    }

}

//TODO onClickListener을 활용해서 아이템을 누르면 더 자세히 볼 수 있게 하기
//TODO onClickListener 비슷한 것을 이용해서 체크 되면 이벤트 발생(완료 시간 업데이트, 글씨 색 줄이기 등)