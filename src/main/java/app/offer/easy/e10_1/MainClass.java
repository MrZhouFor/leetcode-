package app.offer.easy.e10_1;

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
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            int ret = new Solution().fib(n);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
