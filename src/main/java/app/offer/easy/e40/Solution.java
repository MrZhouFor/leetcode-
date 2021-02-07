package app.offer.easy.e40;

import java.util.PriorityQueue;

/**
 * @author zhouze
 * @date 2021/2/7
 */
public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int value : arr) {
            queue.add(value);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }
}
