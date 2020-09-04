package app.all.medium.m3;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * <p>
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * <p>
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * @author zhouze
 * @date 2020/9/4
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Map<Character, Integer> maps = new HashMap<>();
        int answer = 0, left = 0;
        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            if (maps.containsKey(curr)) {
                left = Math.max(left, maps.get(curr) + 1);
            }
            maps.put(curr, i);
            answer = Math.max(answer, i - left + 1);
        }
        return answer;
    }

}
