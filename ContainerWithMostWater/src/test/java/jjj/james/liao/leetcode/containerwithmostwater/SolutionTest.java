package jjj.james.liao.leetcode.containerwithmostwater;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author jamesliao
 * @since 2018/7/16
 */
public class SolutionTest {

    private static final int singleTestTimeout = 600;
    private List<MostWaterSolution> solutionList;

    @Before
    public void init() {
        //@formatter:off
        solutionList = Arrays.asList(
//                new BruteForceSolution()
                new BinarySearchSolution()
        );
        //@formatter:on
    }

    @Test
    public void test_maxArea_WHEN_given12_THEN_return1() throws Exception {
        // given
        int[] numbers = new int[] {1, 2};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(1);
        });
    }

    @Test
    public void test_maxArea_WHEN_given13_THEN_return1() throws Exception {
        // given
        int[] numbers = new int[] {1, 3};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(1);
        });
    }

    @Test
    public void test_maxArea_WHEN_given23_THEN_return2() throws Exception {
        // given
        int[] numbers = new int[] {2, 3};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(2);
        });
    }

    @Test
    public void test_maxArea_WHEN_given123_THEN_return2() throws Exception {
        // given
        int[] numbers = new int[] {1, 2, 3};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(2);
        });
    }

    @Test
    public void test_maxArea_WHEN_given213_THEN_return4() throws Exception {
        // given
        int[] numbers = new int[] {2, 1, 3};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(4);
        });
    }

    @Test
    public void test_maxArea_WHEN_given2113_THEN_return6() throws Exception {
        // given
        int[] numbers = new int[] {2, 1, 1, 3};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(6);
        });
    }

    @Test
    public void test_maxArea_WHEN_given21134_THEN_return8() throws Exception {
        // given
        int[] numbers = new int[] {2, 1, 1, 3, 4};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(8);
        });
    }

    @Test
    public void test_maxArea_WHEN_given24134_THEN_return12() throws Exception {
        // given
        int[] numbers = new int[] {2, 4, 1, 3, 4};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(12);
        });
    }

    @Test
    public void test_maxArea_WHEN_given324134_THEN_return15() throws Exception {
        // given
        int[] numbers = new int[] {3, 2, 4, 1, 3, 4};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(15);
        });
    }

    @Test
    public void test_maxArea_WHEN_given324134100101_THEN_return100() throws Exception {
        // given
        int[] numbers = new int[] {3, 2, 4, 1, 3, 4, 100, 101};
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(100);
        });
    }

    @Test(timeout = singleTestTimeout)
    public void test_maxArea_WHEN_given15000Numbers_THEN_return() {
        int[] numbers = new int[15000];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i;
        solutionList.forEach((solution) -> {
            int maxArea = solution.maxArea(numbers);
            assertThat(maxArea).isEqualTo(56242500);
        });
    }

}