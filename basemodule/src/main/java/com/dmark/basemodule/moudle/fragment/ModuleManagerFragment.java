package com.dmark.basemodule.moudle.fragment;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.dmark.basemodule.base.faragment.LazyLoadFragment;
import com.dmark.basemodule.moudle.activity.ActivityModuleManager;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class ModuleManagerFragment extends LazyLoadFragment {

    protected View rootView;
    protected abstract HashMap<String, ArrayList<Integer>> moduleConfig();
    protected abstract int layoutId();

    protected FragmentModuleManager fragmentModuleManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = LayoutInflater.from(getContext()).inflate(layoutId(), container, false);
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
//        viewTreeObserver.addOnWindowAttachListener(new ViewTreeObserver.OnWindowAttachListener() {
//            @Override
//            public void onWindowAttached() {
//                if (fragmentModuleManager == null) {
//                    initModuleManager(savedInstanceState);
//                }
//            }
//            @Override
//            public void onWindowDetached() {
//            }
//        });
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (fragmentModuleManager != null){
            fragmentModuleManager.onActivityCreate(rootView, savedInstanceState);
        }
    }

    private void initModuleManager(Bundle saveInstance) {
        fragmentModuleManager = new FragmentModuleManager();
        fragmentModuleManager.initModules(saveInstance, getActivity(), rootView, moduleConfig());
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (fragmentModuleManager != null){
            fragmentModuleManager.onViewCreated(view, savedInstanceState);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (fragmentModuleManager != null){
            fragmentModuleManager.onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (fragmentModuleManager != null){
            fragmentModuleManager.onResume();
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        if (fragmentModuleManager != null){
            fragmentModuleManager.onSaveInstanceState(outState);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (fragmentModuleManager != null){
            fragmentModuleManager.onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (fragmentModuleManager != null){
            fragmentModuleManager.onStop();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (fragmentModuleManager != null){
            fragmentModuleManager.onDestroyView();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (fragmentModuleManager != null){
            fragmentModuleManager.onDestroy();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (fragmentModuleManager != null){
            fragmentModuleManager.onDetach();
        }
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (fragmentModuleManager != null){
            fragmentModuleManager.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
    }

    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        if (fragmentModuleManager != null){
            if (isVisible){
                fragmentModuleManager.hide();
            }else {
                fragmentModuleManager.show();
            }
        }
    }

}
