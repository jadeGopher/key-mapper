package com.example.keymapper

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.Settings

class Runner(private val context: Context) {
    fun run(packageName: String, link: String) {

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.setPackage(packageName)
        context.startActivity(intent)
    }

    fun runSettings() {
        val intent = Intent(Settings.ACTION_SETTINGS)
        context.startActivity(intent)
    }
}
