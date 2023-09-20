package com.example.keymapper

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.KeyEvent
import android.view.accessibility.AccessibilityEvent


const val spotify = "com.spotify.tv.android"
const val spotifyLink = "spotify://"
const val youtube = "com.google.android.youtube.tv"
const val youTubeLink = "https://www.youtube.com/"

const val rakutenTVButton = 779
const val smartTVCollectionButton = 326
const val redButton = 183
const val greenButton = 184
const val yellowButton = 185

const val TAG = "mapper"

class Mapper : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        return
    }

    override fun onKeyEvent(event: KeyEvent?): Boolean {
        if (event == null) {
            return false
        }

        // Log.v(TAG, "key pressed ${event.keyCode} ${event.action}")
        if (event.action == KeyEvent.ACTION_DOWN) {
            when (event.keyCode) {
                redButton -> Runner(this).run(youtube, youTubeLink)
                greenButton -> Runner(this).run(spotify, spotifyLink)
                yellowButton -> Log.v(TAG, "yellow button pressed")
            }
        }

        return super.onKeyEvent(event)
    }

    override fun onInterrupt() {
        return
    }
}



