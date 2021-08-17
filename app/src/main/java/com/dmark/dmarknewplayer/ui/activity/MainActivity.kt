package com.dmark.dmarknewplayer.ui.activity

import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.dmark.basemodule.base.BaseActivity
import com.dmark.basemodule.event.BaseEvent
import com.dmark.dmarknewplayer.R
import com.dmark.dmarknewplayer.config.AppConfig
import com.dmark.dmarknewplayer.databinding.ActivityMainBinding
import com.dmark.dmarknewplayer.ui.fragment.PicFragment
import kotlinx.coroutines.processNextEventInCurrentThread
import java.util.*


class MainActivity : BaseActivity<ActivityMainBinding>() {


    private var mPicFragment : PicFragment? = null

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun intiView(){
        setSupportActionBar(mBindingLayout!!.homeToolbar)
        initFragment()
    }

    private fun initFragment(){
        switchFragment(AppConfig.FRAGMENT_INDEX_PIC)
    }
    private fun switchFragment(index : String){
        when(index){

        }
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