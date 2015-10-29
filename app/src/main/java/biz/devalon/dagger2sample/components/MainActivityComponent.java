package biz.devalon.dagger2sample.components;

import biz.devalon.dagger2sample.ui.MainActivity;
import biz.devalon.dagger2sample.modules.MainActivityModule;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by ichiwa on 2015/10/29.
 */
@Singleton
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
