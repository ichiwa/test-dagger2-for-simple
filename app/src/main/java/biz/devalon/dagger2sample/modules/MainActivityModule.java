package biz.devalon.dagger2sample.modules;

import biz.devalon.dagger2sample.presenter.MainActivityPresenter;
import biz.devalon.dagger2sample.ui.MainActivity;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by ichiwa on 2015/10/29.
 */
@Module
public class MainActivityModule {

    private MainActivity mMainActivity;

    public MainActivityModule(MainActivity activity){
        mMainActivity = activity;
    }

    @Provides
    @Singleton
    public MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter(mMainActivity);
    }
}
