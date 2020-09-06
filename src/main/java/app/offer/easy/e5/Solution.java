package app.offer.easy.e5;

/**
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * <p>
 * 限制：
 * 0 <= s 的长度 <= 10000
 *
 * @author zhouz
 * @date 2020/9/6
 * @see [相关类/方法]
 * @since [版本号]
 */
public class Solution {

    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringBuilder.append(' '== c ? "%20" : c);
        }
        return stringBuilder.toString();
    }

}
