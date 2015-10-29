package biz.devalon.dagger2sample.modules;

import biz.devalon.dagger2sample.utils.Logger;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by ichiwa on 2015/10/29.
 */
@Module
public class AppModule {

    @Provides
    @Singleton
    public Logger provideLogger(){
        return new Logger();
    }
}
