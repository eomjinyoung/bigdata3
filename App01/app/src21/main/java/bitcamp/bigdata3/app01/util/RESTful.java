package bitcamp.bigdata3.app01.util;

import org.json.JSONObject;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by bit11 on 2017-08-30.
 */

public class RESTful {
    public static String get(String url) throws Exception {
        URL urlObj = new URL(url);
        URLConnection urlConnection = urlObj.openConnection();

        Scanner in = new Scanner(urlConnection.getInputStream());
        StringBuffer buf = new StringBuffer();
        while (in.hasNext()) {
            buf.append(in.nextLine());
        }
        return buf.toString();
    }

    public static JSONObject getJSON(String url) throws Exception {
        return new JSONObject(get(url));
    }
}
