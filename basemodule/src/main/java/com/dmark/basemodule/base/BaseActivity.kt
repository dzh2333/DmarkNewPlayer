package com.dmark.basemodule.base

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.dmark.basemodule.event.BaseEvent
import com.dmark.basemodule.moudle.activity.ModuleManagerActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

abstract class BaseActivity : ModuleManagerActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EventBus.getDefault().register(this)
        setContentView(getLayoutId())
        intiView()
        initData()
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public fun onEvent(event : BaseEvent){
        eventCallBack(event)
    }

    protected open fun eventCallBack(event : BaseEvent){

    }

    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }

    abstract fun getLayoutId() : Int
    abstract fun intiView()
    abstract fun initData()
}