package com.wsrhp.leetcode.dp;

import java.util.Arrays;
import java.util.List;

public class Triangle {

    /**
     * 120
     * https://leetcode-cn.com/problems/triangle/
     *
     * @param triangle
     * @return
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int lines = triangle.size();
        // n + 1的辅助空间
        int[] dp = new int[lines + 1];
        Arrays.fill(dp, 0);
        // 从下往上
        for (int i = lines -1 ; i >= 0 ; i --) {
            // 从左往右
            for (int j = 0 ; j < triangle.get(i).size(); j++) {
                // 最后一行初始都是0，相当于直接写入
                // 往上走，都是在前一行基础上，先选择最小值，再加上三角形当前位置值，覆盖
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }
}
