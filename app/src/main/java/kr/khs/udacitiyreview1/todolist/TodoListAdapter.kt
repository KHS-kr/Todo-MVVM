package kr.khs.udacitiyreview1.todolist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kr.khs.udacitiyreview1.database.TodoItem
import kr.khs.udacitiyreview1.databinding.ItemTodoListBinding

class TodoListAdapter(val checkListener : TodoItemCheckListener, val clickListener : TodoItemClickListener) : ListAdapter<TodoItem, RecyclerView.ViewHolder>(TodoItemDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return TodoViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is TodoViewHolder -> {
                holder.bind(getItem(position), checkListener, clickListener)
            }
        }
    }

    class TodoViewHolder private constructor(val binding : ItemTodoListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(todoItem : TodoItem, checkListener : TodoItemCheckListener, clickListener : TodoItemClickListener) {
            binding.item = todoItem
            binding.itemIsdone.setOnClickListener {
                checkListener.onClick(todoItem)
            }
//            binding.clickListener = clickListener
            binding.itemCl.setOnLongClickListener {
                clickListener.onClick(todoItem)
                return@setOnLongClickListener false
            }
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent : ViewGroup) : TodoViewHolder {
                val layoutInfalter = LayoutInflater.from(parent.context)
                val binding = ItemTodoListBinding.inflate(
                    layoutInfalter, parent, false
                )

                return TodoViewHolder(binding)
            }
        }
    }
}

class TodoItemDiffCallback : DiffUtil.ItemCallback<TodoItem>() {
    override fun areItemsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
        return oldItem.seq == newItem.seq
    }

    override fun areContentsTheSame(oldItem: TodoItem, newItem: TodoItem): Boolean {
        return oldItem == newItem
    }
}

class TodoItemCheckListener(val clickListener : (seq : Long) -> Unit) {
    fun onClick(item : TodoItem) = clickListener(item.seq)
}

class TodoItemClickListener(val clickListener : (seq : Long) -> Unit) {
    fun onClick(item : TodoItem) = clickListener(item.seq)
}