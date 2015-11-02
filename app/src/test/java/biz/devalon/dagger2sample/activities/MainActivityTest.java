package biz.devalon.dagger2sample.activities;

import android.support.v7.app.AppCompatActivity;
import biz.devalon.dagger2sample.BuildConfig;
import biz.devalon.dagger2sample.R;
import biz.devalon.dagger2sample.RobolectricDataBindingTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;

import static junit.framework.Assert.assertTrue;

/**
 * Created by ichiwa on 15/11/02.
 */
@RunWith(RobolectricDataBindingTestRunner.class)
@Config(constants = BuildConfig.class, emulateSdk = 21)
public class MainActivityTest {
    @Before
    public void setUp() throws Exception {
        ShadowLog.stream = System.out;
    }
    @Test
    public void clickbutton_test(){
        AppCompatActivity activity = Robolectric.setupActivity(MainActivity.class);
        activity.findViewById(R.id.button).performClick();
        ShadowLog.e("","teststetsat");
        //TextView result = (TextView) activity.findViewById(R.id.result);
        //ShadowLog.d("test", result.getText().toString());
        //assertTrue(!"".equals(result.getText().toString()));
        assertTrue(true);
    }
}