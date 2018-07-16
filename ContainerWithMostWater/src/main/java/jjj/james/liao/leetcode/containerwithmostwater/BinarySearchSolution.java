package jjj.james.liao.leetcode.containerwithmostwater;

/**
 * @author jamesliao
 * @since 2018/7/16
 */
public class BinarySearchSolution implements MostWaterSolution {
    @Override
    public int maxArea(int[] height) {
        int maxArea = 0, i = 0, j = 0;
        while (i < height.length && j < height.length) {
            int area = getArea(height, i, j);
            if (area > maxArea) {
                maxArea = area;
                j++;
            }
            else {
                i = j;
                j = i + 1;
            }
        }
        return maxArea;
    }

    int getArea(int[] height,
                int i,
                int j) {
        return (j - i) * Math.min(height[i], height[j]);
    }
}
