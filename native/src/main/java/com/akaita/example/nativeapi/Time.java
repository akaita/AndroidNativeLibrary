package com.akaita.example.nativeapi;

/**
 * Created by mikel on 21/08/2016.
 */
public class Time {
    static {
        System.loadLibrary("NativeCode");
    }

    public String now() {
        return nowNative();
    }

    private native String nowNative();
}
