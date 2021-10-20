package com.jcsanket.noteapp1

import android.app.Application
import com.jcsanket.noteapp1.data.DataStore


class NotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DataStore.init(this)
    }
}