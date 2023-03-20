package com.example.flixvid

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

/**
 * [RecyclerView.Adapter] that can display a [BestMovie] and makes a call to the
 * specified [OnListFragmentInteractionListener].
 */


private const val TAG = "BestMovieRecyclerViewAdapter"

class BestMovieRecyclerViewAdapter(
    private val movies: List<BestMovie>,
    private val mListener: OnListFragmentInteractionListener?
)
    : RecyclerView.Adapter<BestMovieRecyclerViewAdapter.MovieViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_best_movie, parent, false)
        return MovieViewHolder(view)
    }

    /**
     * This inner class lets us refer to all the different View elements
     * (Yes, the same ones as in the XML layout files!)
     */
    inner class MovieViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mItem: BestMovie? = null
        val mMovieTitle: TextView = mView.findViewById<View>(R.id.movie_title) as TextView
        val mMovieRanking: TextView = mView.findViewById<View>(R.id.ranking) as TextView
        val mMovieDescription: TextView = mView.findViewById<View>(R.id.movie_description) as TextView
        val mMovieImage: ImageView = mView.findViewById<View>(R.id.movie_image) as ImageView
        override fun toString(): String {
            return mMovieTitle.toString() + " '" + "'" + mMovieRanking.toString() + "'" + mMovieDescription.text + "'" + mMovieDescription.text + "'" + mMovieImage
        }
    }

    /**
     * This lets us "bind" each Views in the ViewHolder to its' actual data!
     */
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]

        holder.mItem = movie
        holder.mMovieTitle.text = movie.title
        holder.mMovieDescription.text = movie.description
        holder.mMovieRanking.text = movie.rank.toString()


        Glide.with(holder.mView)
            .load("https://image.tmdb.org/t/p/w500/" + movie.movieImageUrl)
            .centerInside()
            .into(holder.mMovieImage)

        holder.mView.setOnClickListener {
            holder.mItem?.let {movie->
                mListener?.onItemClick(movie)
                mListener?.onMovieClick(movie)
            }
        }
    }

    /**
     * Remember: RecyclerView adapters require a getItemCount() method.
     */
    override fun getItemCount(): Int {
        return movies.size
    }


}