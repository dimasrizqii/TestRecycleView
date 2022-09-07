package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GameAdapter(private val listGame: ArrayList<MyGame>)
    : RecyclerView.Adapter<GameAdapter.ViewHolder>(){

        class ViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
            val game: TextView = itemView.findViewById(R.id.tv_game)
            val creator: TextView = itemView.findViewById(R.id.tv_creator)
            val avatar: ImageView = itemView.findViewById(R.id.iv_photo)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_game_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listGame[position]
        holder.game.text = data.game
        holder.creator.text = data.creator
        holder.avatar.setImageResource(data.avatar)
    }

    override fun getItemCount(): Int {
        return listGame.size
    }
}