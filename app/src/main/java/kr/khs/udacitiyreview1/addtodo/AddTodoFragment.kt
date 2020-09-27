package kr.khs.udacitiyreview1.addtodo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import kr.khs.udacitiyreview1.ITEM_ADD
import kr.khs.udacitiyreview1.ITEM_UPDATE
import kr.khs.udacitiyreview1.database.TodoDatabase
import kr.khs.udacitiyreview1.R
import kr.khs.udacitiyreview1.database.TodoDao
import kr.khs.udacitiyreview1.database.TodoItem
import kr.khs.udacitiyreview1.databinding.FragmentAddTodoBinding

class AddTodoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentAddTodoBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_add_todo, container, false
        )

        val application = requireNotNull(activity).application

        val arguments = AddTodoFragmentArgs.fromBundle(requireArguments())

        val database = TodoDatabase.getInstance(application).todoDao

        val viewModelFactory = AddTodoViewModelFactory(arguments.addOrUpdate, database)

        val viewModel = ViewModelProvider(this, viewModelFactory).get(AddTodoViewModel::class.java)

        binding.viewModel = viewModel

        binding.lifecycleOwner = this

        if(arguments.addOrUpdate > 0L)
            viewModel.getUpdateItem(arguments.addOrUpdate)

        viewModel.addOrUpdateComplete.observe(viewLifecycleOwner, Observer {
            if(it) {
                this.findNavController()
                    .navigate(AddTodoFragmentDirections.actionAddTodoFragmentToTodoListFragment())
            }
        })

        return binding.root
    }
}