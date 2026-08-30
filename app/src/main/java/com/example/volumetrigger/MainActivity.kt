package com.example.volumetrigger

import android.media.AudioManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val audioManager =
            getSystemService(AUDIO_SERVICE) as AudioManager

        // Lower media volume by one step
        // and show Android's normal system volume panel.
        audioManager.adjustStreamVolume(
            AudioManager.STREAM_MUSIC,
            AudioManager.ADJUST_LOWER,
            AudioManager.FLAG_SHOW_UI
        )

        // The app itself has no screen.
        finish()
    }
}
