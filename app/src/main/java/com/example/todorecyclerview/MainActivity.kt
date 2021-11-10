package com.example.todorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_todo.*
import kotlinx.android.synthetic.main.item_todo.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(
            ToDo("Are you sure to go outside?", false),
            ToDo("Ask my crush out?", false),
            ToDo("Is she nice girl?" , false),
            ToDo("Just a random line", false),
            ToDo("Is Lucknow is better", false),
            ToDo("Are you sure to go outside?", false),
            ToDo("Are you sure to go outside?", false),
            ToDo("Are you sure to go outside?", false),
            ToDo("Are you sure to go outside?", false),
        )

        val adapter = ToDoAdapter(todoList)
        rvTodo.adapter = adapter
        rvTodo.layoutManager = LinearLayoutManager(this)

        btnToDo.setOnClickListener {
            val title = etToDo.text.toString()
            val todo = ToDo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}