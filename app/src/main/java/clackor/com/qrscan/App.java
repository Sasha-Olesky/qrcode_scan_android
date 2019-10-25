package clackor.com.qrscan;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

/**
 * Created by Administrator on 8/2/2016.
 */
public class App extends Application {
    private static Context _context;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        _context = getApplicationContext();

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static Context getInstance() {
        return _context;
    }


}
