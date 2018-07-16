package jjj.james.liao.leetcode.longestsubstring;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jamesliao
 * @since 2017/3/6
 */
class BruteForceSolution implements LongestSubstringSolution {

    private Set<Character> containedCharacter = new HashSet<>();

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxLength = 0;
        int currentLength = 0;
        for (int j = 0, n = chars.length; j < n && n - j > maxLength; j++) {
            for (int i = j; i < n; i++) {
                Character currentChar = chars[i];
                if (!containedCharacter.contains(currentChar)) {
                    containedCharacter.add(currentChar);
                    currentLength++;
                }
                else {
                    maxLength = getMaxLength(maxLength, currentLength);
                    containedCharacter.clear();
                    currentLength = 0;
                    break;
                }
            }
        }
        maxLength = getMaxLength(maxLength, currentLength);
        return maxLength;
    }

    private int getMaxLength(int maxLength,
                             int currentLength) {
        if (maxLength < currentLength)
            maxLength = currentLength;
        return maxLength;
    }
}
