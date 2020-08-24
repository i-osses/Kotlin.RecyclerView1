package com.prodev.recyclerview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tasks = ArrayList<Task>()
        tasks.add(Task("Learn RecyclerView", false))
        tasks.add(Task("Second Task", true))

        my_recycler_view.adapter = TaskAdapter(tasks)
        my_recycler_view.layoutManager= LinearLayoutManager(this)
    }
}