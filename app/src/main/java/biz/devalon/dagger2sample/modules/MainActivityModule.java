package biz.devalon.dagger2sample.modules;

import biz.devalon.dagger2sample.presenter.MainActivityPresenter;
import biz.devalon.dagger2sample.ui.MainActivity;
import biz.devalon.dagger2sample.components.PerActivity;
import dagger.Module;
import dagger.Provides;

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
    @PerActivity
    public MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter(mMainActivity);
    }
}
