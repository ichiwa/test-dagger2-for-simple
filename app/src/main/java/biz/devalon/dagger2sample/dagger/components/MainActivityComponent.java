package biz.devalon.dagger2sample.dagger.components;

import biz.devalon.dagger2sample.dagger.modules.MainActivityModule;
import biz.devalon.dagger2sample.activities.MainActivity;
import dagger.Component;

/**
 * Created by ichiwa on 2015/10/29.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
