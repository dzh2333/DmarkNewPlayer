package com.dmark.basemodule.base

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.dmark.basemodule.R
import com.dmark.basemodule.event.BaseEvent
import com.dmark.basemodule.moudle.activity.ModuleManagerActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

abstract class BaseActivity<T : ViewDataBinding> : ModuleManagerActivity(){

    protected var mBindingLayout : T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EventBus.getDefault().register(this)
        mBindingLayout = DataBindingUtil.setContentView(this, getLayoutId());
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