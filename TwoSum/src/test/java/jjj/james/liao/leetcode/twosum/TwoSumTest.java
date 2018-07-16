package jjj.james.liao.leetcode.twosum;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jamesliao
 * @since 2017/1/19
 */
public class TwoSumTest {

    @Test
    public void twoSum_sample1() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(new int[] {1, 2, 3, 4, 5}, 8);
        Assert.assertEquals(2, answer.length);
        Assert.assertEquals(2, answer[0]);
        Assert.assertEquals(4, answer[1]);
    }

    @Test
    public void twoSum_sample2() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
        Assert.assertEquals(2, answer.length);
        Assert.assertEquals(0, answer[0]);
        Assert.assertEquals(1, answer[1]);
    }

    @Test
    public void twoSum_sample3() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(new int[] {5, 4, 3, 2, 1}, 8);
        Assert.assertEquals(2, answer.length);
        Assert.assertEquals(0, answer[0]);
        Assert.assertEquals(2, answer[1]);
    }

    @Test
    public void twoSum_sample4() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(new int[] {2, 2, 11, 15}, 4);
        Assert.assertEquals(2, answer.length);
        Assert.assertEquals(0, answer[0]);
        Assert.assertEquals(1, answer[1]);
    }

    @Test
    public void twoSum_sample5() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(new int[] {3, 2, 9, 10, 13, 2, 2, 2, 15}, 18);
        Assert.assertEquals(2, answer.length);
        Assert.assertEquals(0, answer[0]);
        Assert.assertEquals(8, answer[1]);
    }

    @Test
    public void twoSum_sample6() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] answer = twoSum.twoSum(new int[] {3, 2, 4}, 6);
        Assert.assertEquals(2, answer.length);
        Assert.assertEquals(1, answer[0]);
        Assert.assertEquals(2, answer[1]);
    }

}