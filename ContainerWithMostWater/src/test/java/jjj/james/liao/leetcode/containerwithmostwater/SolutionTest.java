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

    List<MostWaterSolution> solutionList;

    @Before
    public void init() {
        solutionList = Arrays.asList(new BruteForceSolution());
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

}