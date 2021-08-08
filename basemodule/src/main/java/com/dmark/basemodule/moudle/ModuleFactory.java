package com.dmark.basemodule.moudle;

import android.text.TextUtils;

import com.dmark.basemodule.moudle.activity.AbsModule;

public class ModuleFactory {

    //反射初始化对应module
    public static <T> T newModuleInstance(String moduleName) {
        if (TextUtils.isEmpty(moduleName)) {
            return null;
        }
        try {
            Class<? extends T> moduleClzz = (Class<? extends T>) Class.forName(moduleName);
            return moduleClzz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}
