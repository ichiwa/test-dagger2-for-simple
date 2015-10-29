package biz.devalon.dagger2sample.utils;

import timber.log.Timber;

/**
 * Created by ichiwa on 2015/10/29.
 */
public class TimberLogger extends Logger {
    public TimberLogger(){
        Timber.plant(new Timber.DebugTree());
    }
    public void log(String s){
        Timber.d(s);
    }
}
