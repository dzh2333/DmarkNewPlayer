package com.dmark.dmarknewplayer

import android.app.Activity
import android.app.IntentService
import android.content.Context
import android.content.Intent
import android.os.*
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dmark.basemodule.base.BaseActivity
import com.dmark.basemodule.event.BaseEvent
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.*


class MainActivity : BaseActivity() {

    private var bttton : Button? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun intiView(){
    }

    override fun initData() {
    }

    override fun eventCallBack(event: BaseEvent) {

    }

    override fun moduleConfig(): HashMap<String, ArrayList<Int>> {
        val map = HashMap<String, ArrayList<Int>>()
        return map
    }
}