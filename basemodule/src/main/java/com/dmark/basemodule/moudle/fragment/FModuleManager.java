package com.dmark.basemodule.moudle.fragment;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FModuleManager {

    private List<String> modules = new ArrayList<>(); //模块类全限定名
    protected HashMap<String, FbsModule> allModules = new HashMap<>(); //模块实体

    public List<String> getModuleNames() {
        return modules;
    }

    public void moduleConfig(List<String> modules) {
        this.modules = modules;
    }

    public FbsModule getModuleByName(String name) {
        if (!allModules.isEmpty()) {
            return allModules.get(name);
        }
        return null;
    }

    public void onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onCreateView(inflater, container, savedInstanceState);
            }
        }
    }

    public void onActivityCreate(View view , Bundle savedInstanceState){
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onActivityCreate(view, savedInstanceState);
            }
        }
    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onViewCreated(view, savedInstanceState);
            }
        }
    }

    public void onStart(){
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onStart();
            }
        }
    }

    public void show(){
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.show();
            }
        }
    }

    public void hide(){
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.hide();
            }
        }
    }

    public void onSaveInstanceState(Bundle outSave){
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onSaveInstanceState(outSave);
            }
        }
    }

    public void onResume() {
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onResume();
            }
        }
    }

    public void onPause() {
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onPause();
            }
        }
    }

    public void onStop() {
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onStop();
            }
        }
    }

    public void onDestroyView() {
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onDestroyView();
            }
        }
    }

    public void onDestroy() {
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onDestroy();
            }
        }
    }

    public void onDetach() {
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onDetach();
            }
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        for (FbsModule module : allModules.values()) {
            if (module != null) {
                module.onOrientationChanges(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE);
            }
        }
    }
}
