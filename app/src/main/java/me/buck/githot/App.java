package me.buck.githot;

import android.app.Application;

import me.buck.githot.util.RetrofitUtils;
import me.buck.githot.util.Utils;

/**
 * Created by gwf on 2019/7/2
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
        RetrofitUtils.init();
    }
}
