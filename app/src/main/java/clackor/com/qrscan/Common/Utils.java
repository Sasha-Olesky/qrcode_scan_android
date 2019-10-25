package clackor.com.qrscan.Common;

import android.app.Activity;
import android.content.Intent;

import clackor.com.qrscan.R;

/**
 * Created by Administrator on 8/2/2016.
 */
public class Utils {
    /**
     * finish Activity
     *
     * @param activity
     */
    public static void finish(Activity activity) {
        activity.finish();
        activity.overridePendingTransition(R.anim.push_right_in,
                R.anim.push_right_out);
    }

    /**
     * start Activity
     *
     * @param activity
     * @param cls
     */
    public static void start_Activity(Activity activity, Class<?> cls) {
        Intent intent = new Intent();
        intent.setClass(activity, cls);

        activity.startActivity(intent);
        activity.overridePendingTransition(R.anim.push_left_in,
                R.anim.push_left_out);
    }
}
