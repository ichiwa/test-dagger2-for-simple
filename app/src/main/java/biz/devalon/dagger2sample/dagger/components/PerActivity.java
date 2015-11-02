package biz.devalon.dagger2sample.dagger.components;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Scope;

/**
 * Created by ichiwa on 2015/10/30.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {}