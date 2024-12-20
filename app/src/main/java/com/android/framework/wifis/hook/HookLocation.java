package com.android.framework.wifis.hook;



public class HookLocation {

    private ClassLoader classLoader;


    public void start(ClassLoader classLoader) {
        this.classLoader = classLoader;

    }


}