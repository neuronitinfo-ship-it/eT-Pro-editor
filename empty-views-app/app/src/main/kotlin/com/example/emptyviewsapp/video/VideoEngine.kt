package com.example.emptyviewsapp.video

import android.content.Context
import android.net.Uri
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.video.VideoSize
import com.google.android.exoplayer2.Player

class VideoEngine(private val context: Context) {

    private var player: SimpleExoPlayer? = null

    fun initializePlayer() {
        player = SimpleExoPlayer.Builder(context).build()
        player?.addListener(object : Player.Listener {
            override fun onVideoSizeChanged(videoSize: VideoSize) {
                // Handle video size changes if needed
            }
        })
    }

    fun playVideo(videoUri: Uri) {
        val mediaItem = MediaItem.fromUri(videoUri)
        player?.setMediaItem(mediaItem)
        player?.prepare()
        player?.play()
    }

    fun pauseVideo() {
        player?.pause()
    }

    fun stopVideo() {
        player?.stop()
    }

    fun releasePlayer() {
        player?.release()
        player = null
    }
}