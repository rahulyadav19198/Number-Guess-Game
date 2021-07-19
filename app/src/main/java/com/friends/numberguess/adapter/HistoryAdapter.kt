package com.friends.numberguess.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.friends.numberguess.R

class HistoryAdapter(val context: Context, val itemList:ArrayList<String>) :RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    class HistoryViewHolder(view: View): RecyclerView.ViewHolder(view){

        var showPrevious:TextView= view.findViewById(R.id.showPrevious)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.button_single_row,parent,false)
        return HistoryViewHolder(
            view
        )

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {

        val his=itemList[position]
        holder.showPrevious.text= his.toString()
    }

}