package com.trying.podcast.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.trying.podcast.R
import com.trying.podcast.service.ItunesRepo
import com.trying.podcast.service.ItunesService

class PodcastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_podcast)

        val TAG = javaClass.simpleName
        val itunesPodcast = ItunesService.instance
        val itunesRepo = ItunesRepo(itunesPodcast)

        itunesRepo.searchByTerm("Android Developer") {
            Log.i(TAG, "Results = $it")
        }
    }

}
