package jjj.james.liao.leetcode.containerwithmostwater;

/**
 * @author jamesliao
 * @since 2018/7/16
 */
public class BruteForceSolution implements MostWaterSolution {
    @Override
    public int maxArea(int[] height) {
        int maxArea =0;
        for (int i = 0; i < height.length; i++) {
            for(int j = i+1 ; j < height.length; j++){
                int area = Math.abs((j - i) * Math.min(height[i],height[j]));
                maxArea = Math.max(area,maxArea);
            }
        }
        return maxArea;
    }
}
