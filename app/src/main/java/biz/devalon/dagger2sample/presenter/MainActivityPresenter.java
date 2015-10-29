package biz.devalon.dagger2sample.presenter;

import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import biz.devalon.dagger2sample.R;
import biz.devalon.dagger2sample.ui.MainActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ichiwa on 2015/10/29.
 */
public class MainActivityPresenter extends Presenter {

    MainActivity mMainActivity;
    View mView;

    @Bind(R.id.button)
    Button mButton;

    public MainActivityPresenter(MainActivity activity){
        this.mMainActivity = activity;
        this.mView = mMainActivity.findViewById(android.R.id.content);
        ButterKnife.bind(this, mView);
    }

    @OnClick(R.id.button)
    void onClickButton(View view){
        Snackbar.make(mView, "Hello World", Snackbar.LENGTH_LONG).show();
    }
}
