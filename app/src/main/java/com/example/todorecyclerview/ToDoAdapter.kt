package com.example.todorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*

class ToDoAdapter(
    var todos:List<ToDo>
) : RecyclerView.Adapter<ToDoAdapter.ToDoViewHoder>() {

    inner class ToDoViewHoder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHoder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return ToDoViewHoder(view)
    }

    override fun onBindViewHolder(holder: ToDoViewHoder, position: Int) {
        holder.itemView.apply {
            tvTitle.text = todos[position].title
            cbDone.isChecked = todos[position].isChecked
        }

    }

    override fun getItemCount(): Int {
        return todos.size
    }
}