package biz.devalon.dagger2sample.apis;

import biz.devalon.dagger2sample.libs.JSONConverterFactory;
import java.util.Map;
import org.json.JSONObject;
import retrofit.Call;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.QueryMap;

/**
 * Created by ichiwa on 2015/10/30.
 */
public class WeatherApiGenerator {

    public static WeatherApi create(){
        return new Retrofit
            .Builder()
            .addConverterFactory(JSONConverterFactory.create())
            .baseUrl("http://api.openweathermap.org")
            .build()
            .create(WeatherApi.class);
    }

    public interface WeatherApi {
        @GET("/data/2.5/weather")
        Call<JSONObject> get(@QueryMap Map<String, String> options);
    }
}
