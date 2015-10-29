package biz.devalon.dagger2sample.components;

import biz.devalon.dagger2sample.App;
import biz.devalon.dagger2sample.modules.AppModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by ichiwa on 2015/10/29.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);
}
