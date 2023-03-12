package com.example.flixvid

import com.google.gson.annotations.SerializedName

    /**
     * The Model for storing a single movie from the Movie database API
     *
     * SerializedName tags MUST match the JSON response for the
     * object to correctly parse with the gson library.
     */

    class BestMovie {
        @SerializedName("vote_average")
        var rank = 0.0

        @JvmField
        @SerializedName("original_title")
        var title: String? = null


        @SerializedName("backdrop_path")
        var bookImageUrl: String? = null

        @SerializedName("overview")
        var description: String? = null

    }
