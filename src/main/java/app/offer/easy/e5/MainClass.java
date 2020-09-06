package app.offer.easy.e5;

import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhouz
 * @date 2020/9/6
 * @see [相关类/方法]
 * @since [版本号]
 */
public class MainClass {

    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String         line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            String ret = new Solution().replaceSpace(s);

            String out = (ret);

            System.out.print(out);
        }
    }

}
