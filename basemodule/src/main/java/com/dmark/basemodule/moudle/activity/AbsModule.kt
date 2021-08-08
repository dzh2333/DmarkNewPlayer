package com.dmark.basemodule.moudle.activity

import android.os.Bundle


abstract class AbsModule {
    //初始化将AbsModule的参数传入
    abstract fun onCreate(moduleContext: ModuleContext?)
    abstract fun onSaveInstanceState(outState: Bundle?)
    abstract fun onResume()
    abstract fun onPause()
    abstract fun onStop()
    abstract fun onDestroy()

    abstract fun onOrientationChanges(isLandscape: Boolean)
}