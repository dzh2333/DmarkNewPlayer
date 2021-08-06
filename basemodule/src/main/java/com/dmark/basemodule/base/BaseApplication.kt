package com.dmark.basemodule.base

import android.app.Application

class BaseApplication : Application(), IApplication{

    override fun onCreate() {
        super.onCreate()

    }

    override fun init() {
    }
}