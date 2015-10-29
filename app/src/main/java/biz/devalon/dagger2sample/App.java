package biz.devalon.dagger2sample;

import android.app.Application;
import biz.devalon.dagger2sample.components.AppComponent;
import biz.devalon.dagger2sample.components.DaggerAppComponent;
import biz.devalon.dagger2sample.modules.AppModule;
import biz.devalon.dagger2sample.utils.Logger;
import javax.inject.Inject;

/**
 * Created by ichiwa on 2015/10/29.
 */
public class App extends Application {

    public static AppComponent mAppComponent;

    @Inject
    Logger mLogger;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        mAppComponent.inject(this);

        mLogger.log("Hello World !!");

    }
}
