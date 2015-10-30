package biz.devalon.dagger2sample.libs.JSONConverter;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.IOException;
import retrofit.Converter;

/**
 * Created by ichiwa on 2015/10/30.
 */
public class JSONRequestBodyConverter<T> implements Converter<T, RequestBody>{
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");

    public JSONRequestBodyConverter() {
    }

    @Override
    public RequestBody convert(T value) throws IOException {
        return RequestBody.create(MEDIA_TYPE, value.toString());
    }
}
