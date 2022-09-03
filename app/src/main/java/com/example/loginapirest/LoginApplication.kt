package com.example.loginapirest

import android.app.Application

class LoginApplication : Application (){
    companion object{
        lateinit var storeAPI: ReqResAPI
    }

    override fun onCreate() {
        super.onCreate()
        storeAPI = ReqResAPI.getInstance(this)
    }
}