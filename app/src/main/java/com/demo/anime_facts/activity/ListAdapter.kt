package com.demo.anime_facts.activity

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.demo.anime_facts.model.AnimeList

class ListAdapter(private val context: Context, private val mAnimeList: List<AnimeList>,
                  private val mRowLayout: Int) : RecyclerView.Adapter<ListAdapter.AnimeViewHolder>(){

    class AnimeViewHolder(val view: View) : RecyclerView.ViewHolder(view){

 /*       val  animeImage: Any = view.animeImg;
        val animeId = view.animeId;
        val animeName = view.animeName;*/

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(mRowLayout,parent)
        return AnimeViewHolder(view)

    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        /*holder.animeImage?.text = context.resources.getString(R.string.animeImg, position + 1)
        holder.animeId?.text = context.resources.getString(R.string.animeId, mAnimeList[position].animeId)
        holder.animeName?.text = context.resources.getString(R.string.animeName, mAnimeList[position].animeName)*/

        holder.view.setOnClickListener {
           // Toast.makeText(context, "Clicked on: " + holder.animeName.text, Toast.LENGTH_SHORT).show();
        }
    }

    override fun getItemCount(): Int {
        return mAnimeList.size

    }

}