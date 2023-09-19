package com.jhomlala.better_player

import android.util.Log
import androidx.media3.session.MediaSession
import androidx.media3.session.MediaSessionService

class PlayerService : MediaSessionService() {

    override fun onCreate() {
        super.onCreate()
        Log.d("chech","Created Service")
    }

    override fun onGetSession(controllerInfo: MediaSession.ControllerInfo): MediaSession? {
        TODO("Not yet implemented")
    }
}