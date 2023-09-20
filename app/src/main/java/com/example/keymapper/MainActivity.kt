package com.example.keymapper

import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.Button
import androidx.fragment.app.FragmentActivity


/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity() {
    private lateinit var mMetrics: DisplayMetrics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        prepareBackgroundManager()

        setupUIElements()
    }

    override fun onDestroy() {
        super.onDestroy()

    }

    private fun prepareBackgroundManager() {
        mMetrics = DisplayMetrics()
        this.windowManager.defaultDisplay.getMetrics(mMetrics)
    }

    private fun setupUIElements() {
        title = getString(R.string.browse_title)

        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.settingsButton)
        button.setOnClickListener {
            Runner(this).runSettings()
        }

        // set fastLane (or headers) background color
        // color = ContextCompat.getColor(this, R.color.fastlane_background)
    }

}
