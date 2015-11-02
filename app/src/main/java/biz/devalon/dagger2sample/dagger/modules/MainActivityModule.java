package biz.devalon.dagger2sample.dagger.modules;

import biz.devalon.dagger2sample.views.presenters.MainActivityPresenter;
import biz.devalon.dagger2sample.activities.MainActivity;
import biz.devalon.dagger2sample.dagger.components.PerActivity;
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
