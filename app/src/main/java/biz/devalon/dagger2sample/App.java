package biz.devalon.dagger2sample;

import android.app.Application;
import biz.devalon.dagger2sample.components.AppComponent;
import biz.devalon.dagger2sample.components.DaggerAppComponent;
import biz.devalon.dagger2sample.modules.AppModule;
import timber.log.Timber;

/**
 * Created by ichiwa on 2015/10/29.
 */
public class App extends Application {

    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();
        appComponent.inject(this);
        Timber.plant(new Timber.DebugTree());
    }
}
