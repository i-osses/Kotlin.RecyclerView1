package com.prodev.recyclerview1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.task_item.view.*

class TaskAdapter (private val tasks :ArrayList<Task> = ArrayList()) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    class TaskViewHolder (view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.task_item, parent, false)
            return (TaskViewHolder(view))
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.itemView.message_view.text = tasks[position].taskName
    }

    override fun getItemCount(): Int {
        return tasks.size
    }


}