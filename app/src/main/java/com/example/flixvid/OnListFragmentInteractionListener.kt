package com.example.flixvid


/**
 * This interface is used by the [BestMovieRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [BestMovieFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: BestMovie)
    //new activity to display the movie details
    fun onMovieClick(movie: BestMovie)
}