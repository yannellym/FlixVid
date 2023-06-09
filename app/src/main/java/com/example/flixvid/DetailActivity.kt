package com.example.flixvid

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions

private const val TAG = "DetailsFragment"
class DetailsActivity : Activity() {
    private lateinit var releaseDateTextView: TextView
    private lateinit var adultTextView: TextView
    private lateinit var voteCountTextView: TextView
    private lateinit var mainImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        adultTextView = findViewById(R.id.AdultTextView)
        releaseDateTextView = findViewById(R.id.releaseDateTextView)
        voteCountTextView = findViewById(R.id.voteTextView)
        mainImage = findViewById(R.id.imageView2)

        val movie = intent.getSerializableExtra(MOVIE_EXTRA) as BestMovie

        releaseDateTextView.text = movie.releaseDate
        adultTextView.text = movie.adultMovie
        voteCountTextView.text = movie.voteCount

        // Load the media image
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/" + movie.movieImageUrl)
            .apply(RequestOptions.bitmapTransform( RoundedCorners(40)))
            .into(mainImage)
    }

}
