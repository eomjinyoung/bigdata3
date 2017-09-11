package bitcamp.bigdata3.app01.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Created by bit11 on 2017-08-30.
 */

public class Utils {
    public static String toDetailMessage(Exception e) {
        StringWriter out = new StringWriter();
        e.printStackTrace(new PrintWriter(out));
        return out.toString();
    }
}
