//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 示例: 
//
// 输入: [0,1,0,3,12]
//输出: [1,3,12,0,0] 
//
// 说明: 
//
// 
// 必须在原数组上操作，不能拷贝额外的数组。 
// 尽量减少操作次数。 
// 
// Related Topics 数组 双指针 
// 👍 935 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        // 一定是需要循环数组的
        for (int i = 0; i < nums.length; i++) {
            // 迭代的元素是否为0， 非零的与下标为j的元素交换
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                // j的增长取决于当前数组的迭代值是否为零
                // 只有当前不为零，i与j同步增长
                j++;
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
