package xyz.phyoekhant.padc2_week1_implicit_intent;

import android.app.Application;
import android.content.Context;

/**
 * Created by Phyoe Khant on 6/8/17.
 */
public class MyApp  extends Application {

    public static String TAG = "MyApp";

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
