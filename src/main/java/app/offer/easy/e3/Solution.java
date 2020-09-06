package app.offer.easy.e3;

import java.util.HashSet;
import java.util.Set;

/**
 * 剑指 Offer 03. 数组中重复的数字
 * 找出数组中重复的数字。
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * <p>
 * 限制：
 * 2 <= n <= 100000
 *
 * @author zhouze
 * @date 2020/9/6
 */
public class Solution {

    public int findRepeatNumber(int[] nums) {
        return answer1(nums);
    }

    /**
     * todo: 优化
     *
     * @param nums
     * @return
     */
    private int answer2(int[] nums) {

    }

    /**
     * 第一次写的答案，表现不佳
     *
     * @param nums
     * @return
     */
    private int answer1(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for (int num : nums) {
            if (!sets.add(num)) {
                return num;
            }
        }
        throw new IllegalArgumentException("no repeat num");
    }

}
