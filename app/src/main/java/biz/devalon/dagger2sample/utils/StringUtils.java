package biz.devalon.dagger2sample.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Created by ichiwa on 2015/10/30.
 */
public class StringUtils {

    /**
     * Convert a JSON string to pretty print
     * version
     *
     * @see <a href="https://coderwall.com/p/ab5qha/convert-json-string-to-pretty-print-java-gson">
     * Convert JSON string to Pretty Print (Java,Gson)
     * </>
     */
    public static String toPrettyFormat(String jsonString) {
        JsonParser parser = new JsonParser();
        JsonObject json = parser.parse(jsonString).getAsJsonObject();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(json);

        return prettyJson;
    }

}
