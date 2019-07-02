package me.buck.githot.util;

import android.app.Application;
import android.graphics.drawable.StateListDrawable;

/**
 * Created by gwf on 2019/7/2
 */
public class Utils {

    private static Application sApp;

    public static void init(Application app) {
        sApp = app;
    }

    public static Application getApp() {
        return sApp;
    }
}
