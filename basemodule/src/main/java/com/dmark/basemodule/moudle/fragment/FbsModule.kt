package com.dmark.basemodule.moudle.fragment

import android.content.Context
import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dmark.basemodule.moudle.activity.ModuleContext


abstract class FbsModule {
    abstract fun init(moduleContext: FragmentModuleContext?)
    abstract fun onCreateView(inflater : LayoutInflater, container : ViewGroup, savedInstanceState : Bundle)
    abstract fun onActivityCreate(view: View,  savedInstanceState : Bundle)
    abstract fun onViewCreated(view: View,  savedInstanceState : Bundle)
    abstract fun onStart()
    abstract fun onResume()
    abstract fun onPause()
    abstract fun onStop()
    abstract fun onDestroyView()
    abstract fun onDestroy()
    abstract fun onDetach()
    abstract fun onOrientationChanges(isLandscape: Boolean)
    abstract fun onSaveInstanceState(outState: Bundle?)


    abstract fun show()
    abstract fun hide()
}