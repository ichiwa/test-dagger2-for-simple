package biz.devalon.dagger2sample.network.converter;

import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit.Converter;

/**
 * Created by ichiwa on 2015/10/30.
 */
public class JSONResponseBodyConverter<T> implements Converter<ResponseBody, T>{

    JSONResponseBodyConverter() {

    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        JSONObject jsonObj;
        try {
            jsonObj = new JSONObject(value.string());
            return (T) jsonObj;
        } catch(JSONException e) {
            return null;
        }
    }
}
