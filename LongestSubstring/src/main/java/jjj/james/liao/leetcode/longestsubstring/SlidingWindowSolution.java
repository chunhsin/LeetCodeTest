package jjj.james.liao.leetcode.longestsubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jamesliao
 * @since 2018/7/13
 */
public class SlidingWindowSolution implements LongestSubstringSolution {

    @Override
    public int lengthOfLongestSubstring(String questionString) {
        Set<Character> slideWindow = new HashSet<>();
        int ans = 0, left = 0, right = 0;
        int length = questionString.length();
        while (left < length && right < length) {
            if (!slideWindow.contains(questionString.charAt(right))) {
                slideWindow.add(questionString.charAt(right++));
                ans = Math.max(ans, slideWindow.size());
            }
            else
                slideWindow.remove(questionString.charAt(left++));
        }
        return ans;
    }
}
