package app.all.easy.e7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author zhouze
 * @date 2020/9/1
 * @see [相关类/方法]
 * @since [版本号]
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);

            int ret = new Solution().reverse(x);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
