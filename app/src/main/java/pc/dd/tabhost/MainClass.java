package pc.dd.tabhost;

import android.app.Application;
import android.content.res.Configuration;

import com.vk.sdk.VKScope;
import com.vk.sdk.VKSdk;

/**
 * Created by User on 19.03.2016.
 */

public class MainClass extends Application {
    //private static String[] vkScope = new String[]{VKScope.WALL};
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        VKSdk.initialize(this);

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

}