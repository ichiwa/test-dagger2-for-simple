package biz.devalon.dagger2sample.network.converter;

import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ResponseBody;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import org.json.JSONObject;
import retrofit.Converter;

/**
 * Created by ichiwa on 2015/10/29.
 */
public class JSONConverterFactory extends Converter.Factory {

    public static JSONConverterFactory create() {
        return new JSONConverterFactory ();
    }

    public Converter<ResponseBody, ?> fromResponseBody(Type type, Annotation[] annotations) {
        return new JSONResponseBodyConverter<JSONObject>();
    }

    public Converter<?, RequestBody> toRequestBody(Type type, Annotation[] annotations) {
        return new JSONRequestBodyConverter<JSONObject>();
    }
}
