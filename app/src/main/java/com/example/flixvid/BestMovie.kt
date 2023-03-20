package com.example.flixvid

import android.os.Parcel
import android.os.Parcelable
import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

    /**
     * The Model for storing a single movie from the Movie database API
     *
     * SerializedName tags MUST match the JSON response for the
     * object to correctly parse with the gson library.
     */
    @Keep
    @Serializable
    data class BestMovie(
        @SerializedName("vote_average")
        var rank: Double = 0.0,

        @JvmField
        @SerializedName("original_title")
        var title: String? = null,


        @SerializedName("backdrop_path")
        var bookImageUrl: String? = null,
        @SerializedName("overview")
        var description: String? = null,

        @SerializedName("release_data")
        var releaseDate: String? = null,

        @SerializedName("vote_count")
        var voteCount: String? = null,

        @SerializedName("adult")
        var adultMovie: String? = null,

        )
        : java.io.Serializable {
        val mediaImageUrl = "https://www.nytimes.com/${bookImageUrl}"

        @Keep
        @Serializable
        data class MultiMedia(
            @SerialName("backdrop_path")
            val url: String?
        ) : java.io.Serializable, Parcelable {
            constructor(parcel: Parcel) : this(parcel.readString()) {
            }

            override fun writeToParcel(parcel: Parcel, flags: Int) {
                parcel.writeString(url)
            }

            override fun describeContents(): Int {
                return 0
            }

            companion object CREATOR : Parcelable.Creator<MultiMedia> {
                override fun createFromParcel(parcel: Parcel): MultiMedia {
                    return MultiMedia(parcel)
                }

                override fun newArray(size: Int): Array<MultiMedia?> {
                    return arrayOfNulls(size)
                }
            }
        }
        }