package com.example.flixvid

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
private const val TAG = "DetailsFragment"
class DetailsActivity : Activity() {
    private lateinit var releaseDateTextView: TextView
    private lateinit var adultTextView: TextView
    private lateinit var voteCountTextView: TextView

    fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.activity_detail, container, false)
        adultTextView = view.findViewById(R.id.adultTitleTextView)
        releaseDateTextView = view.findViewById(R.id.releaseDateTextView)
        voteCountTextView = view.findViewById(R.id.voteTitleTextView)

        return view
    }

    fun displayDetails(title: String, releaseDate: String, adult: Boolean, voteCount: Int) {
        adultTextView.text = title
        releaseDateTextView.text = "Release Date: $releaseDate"
        adultTextView.text = "Adult: ${if (adult) "Yes" else "No"}"
        voteCountTextView.text = "Vote Count: $voteCount"
    }
}
