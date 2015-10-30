package biz.devalon.dagger2sample.presenter;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import biz.devalon.dagger2sample.R;
import biz.devalon.dagger2sample.apis.WeatherApiGenerator;
import biz.devalon.dagger2sample.ui.MainActivity;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import timber.log.Timber;

/**
 * Created by ichiwa on 2015/10/29.
 */
public class MainActivityPresenter extends Presenter {

    MainActivity mMainActivity;
    View mView;

    @Bind(R.id.button)
    Button mButton;

    @Bind(R.id.result)
    TextView mResult;

    public MainActivityPresenter(MainActivity activity) {
        this.mMainActivity = activity;
        this.mView = mMainActivity.findViewById(android.R.id.content);
        ButterKnife.bind(this, mView);
    }

    @OnClick(R.id.button)
    void onClickButton(View view) {
        Map<String, String> params = new HashMap<>();
        params.put("q", "tokyo");
        params.put("APPID", "d0ca227fdc9e831a32c172faae08b6d6");
        WeatherApiGenerator.WeatherApi api = WeatherApiGenerator.create();
        Call<JSONObject> call = api.get(params);
        call.enqueue(new Callback<JSONObject>() {
            @Override
            public void onResponse(Response<JSONObject> response, Retrofit retrofit) {
                if (response.isSuccess()) {
                    renderResult(response.body().toString());
                } else {
                    renderResult(response.errorBody().toString());
                }
            }
            @Override
            public void onFailure(Throwable t) {
                Timber.e(t.getMessage());
                renderResult(t.getMessage());
            }
        });

    }

    public void renderResult(String text) {
        mResult.setText(text);
    }
}
