package biz.devalon.dagger2sample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import biz.devalon.dagger2sample.R;
import biz.devalon.dagger2sample.components.DaggerMainActivityComponent;
import biz.devalon.dagger2sample.components.MainActivityComponent;
import biz.devalon.dagger2sample.modules.MainActivityModule;
import biz.devalon.dagger2sample.presenter.MainActivityPresenter;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private MainActivityComponent mMainActivityComponent;

    @Inject
    MainActivityPresenter mMainActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMainActivityComponent = DaggerMainActivityComponent.builder().mainActivityModule(new MainActivityModule(this)).build();
        mMainActivityComponent.inject(this);
    }
}
