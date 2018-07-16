package jjj.james.liao.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jamesliao
 * @since 2017/1/19
 */
class TwoSum {

    int[] twoSum(int[] nums,
                 int target) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int pos = 0; pos < nums.length; pos++) {
            int diff = target - nums[pos];
            if (integerMap.containsKey(diff)) {
                return new int[] {integerMap.get(diff), pos};
            }
            integerMap.put(nums[pos], pos);
        }

        return new int[] {};
    }
}