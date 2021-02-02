package com.kt.mystudy;

import android.os.Build;

public class test {

    public test() {
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {

        }

        long[] aaa = new long[]{100, 200, 100, 200};
    }
}
