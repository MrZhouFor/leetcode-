//给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。 
//
// 求在该柱状图中，能够勾勒出来的矩形的最大面积。 
//
// 
//
// 
//
// 以上是柱状图的示例，其中每个柱子的宽度为 1，给定的高度为 [2,1,5,6,2,3]。 
//
// 
//
// 
//
// 图中阴影部分为所能勾勒出的最大矩形面积，其面积为 10 个单位。 
//
// 
//
// 示例: 
//
// 输入: [2,1,5,6,2,3]
//输出: 10 
// Related Topics 栈 数组 
// 👍 1162 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
// 1. 暴力求解1,枚举所有的情况，用最小的棒子高度计算面积. O(n^3)
// 2. 暴力求解2,从某个棒子开始，确定左右边界. O(n^2)
// 2. 栈 O(n)

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        Stack<Integer> monoStack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!monoStack.isEmpty() && heights[monoStack.peek()] >= heights[i]) {
                right[monoStack.peek()] = i;
                monoStack.pop();
            }
            left[i] = monoStack.isEmpty() ? -1 : monoStack.peek();
            monoStack.push(i);
        }

        int area = 0;
        for (int i = 0; i < n; i++) {
            area = Math.max(area, (right[i] - left[i] - 1) * heights[i]);
        }
        return area;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
