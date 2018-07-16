package jjj.james.liao.leetcode.containerwithmostwater;

/**
 * @author jamesliao
 * @since 2018/7/16
 */
public class NarrowByTwoSideSolution implements MostWaterSolution {
    @Override
    public int maxArea(int[] height) {
        int maxArea = 0, i = 0, j = height.length - 1;
        while (i != j) {
            int area = getArea(height, i, j);
            if (area > maxArea)
                maxArea = area;
            if (height[j] >= height[i])
                i++;
            else
                j--;
        }
        return maxArea;
    }

    int getArea(int[] height,
                int i,
                int j) {
        return (j - i) * Math.min(height[i], height[j]);
    }
}
