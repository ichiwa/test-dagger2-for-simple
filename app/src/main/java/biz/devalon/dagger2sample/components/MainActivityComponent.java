package biz.devalon.dagger2sample.components;

import biz.devalon.dagger2sample.modules.MainActivityModule;
import biz.devalon.dagger2sample.ui.MainActivity;
import biz.devalon.dagger2sample.utils.PerActivity;
import dagger.Component;

/**
 * Created by ichiwa on 2015/10/29.
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
