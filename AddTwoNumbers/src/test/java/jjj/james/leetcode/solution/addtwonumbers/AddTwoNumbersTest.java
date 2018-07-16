package jjj.james.leetcode.solution.addtwonumbers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author jamesliao
 * @since 2017/1/19
 */
public class AddTwoNumbersTest {

    private List<TestData> targetList;

    @Before
    public void setUp() {
        targetList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            long target1 = (long) (Math.random() * 100000000L);
            long target2 = (long) (Math.random() * 100000000L);
            targetList.add(new TestData(target1, target2));
        }
    }

    @Test
    public void isZero() throws Exception {
        Stream.of(1L, 21L, 333L, 99999999991L, 0L)
              .forEach(num -> {
                  AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
                  ListNode answer = intToListNode(num);
                  boolean isZero = addTwoNumbers.isZero(answer);
                  log.debug("answer : {} , num : {}", answer.toString(), num);
                  Assert.assertEquals(isZero, num == 0);
              });
    }

    @Test
    public void intToListNode() throws Exception {
        Stream.of(1L, 21L, 333L, 99999999991L)
              .forEach(num -> {
                  ListNode answer = intToListNode(num);
                  log.debug("answer : {} , num : {}", answer.toString(), num);
                  Assert.assertEquals(String.valueOf(num), answer.toString());
              });
    }

    @Test
    public void listNodeToInt() throws Exception {

        Stream.of(1L, 21L, 333L, 99999999991L)
              .forEach(num -> {
                  ListNode question = intToListNode(num);
                  long value = listNodeToInt(question);
                  log.debug("question : {} , num : {} , value : {}", question.toString(), num, value);
                  Assert.assertEquals(num.longValue(), value);
              });
    }

    @Test
    public void addTwoNumbers() throws Exception {
        List<TestData> targetList = Arrays.asList(new TestData(1L, 1L),
                                                  new TestData(21L, 1L),
                                                  new TestData(21L, 9L),
                                                  new TestData(221L, 9L),
                                                  new TestData(1L, 999999999L),
                                                  new TestData(9L, 9999999991L),
                                                  new TestData(1234L, 4321L),
                                                  new TestData(0, 4321L),
                                                  new TestData(0, 0),
                                                  new TestData(1534630418L, 1962817311L));
        targetList.forEach(testData -> doTest(testData.target1, testData.target2));
    }

    @Test
    public void addTwoNumbers2() throws Exception {
        List<TestData> targetList = Arrays.asList(new TestData(1L, 1L),
                                                  new TestData(21L, 1L),
                                                  new TestData(21L, 9L),
                                                  new TestData(221L, 9L),
                                                  new TestData(1L, 999999999L),
                                                  new TestData(9L, 9999999991L),
                                                  new TestData(1234L, 4321L),
                                                  new TestData(0, 4321L),
                                                  new TestData(0, 0),
                                                  new TestData(1534630418L, 1962817311L));
        targetList.forEach(testData -> doTest2(testData.target1, testData.target2));
    }

    @Test
    public void addTwoNumbers_random() throws Exception {

        targetList.forEach(testData -> doTest(testData.target1, testData.target2));
    }

    @Test
    public void addTwoNumbers_random2() throws Exception {
        targetList.forEach(testData -> doTest2(testData.target1, testData.target2));
    }

    private ListNode intToListNode(long value) {
        ListNode answer = new ListNode(0);
        if (value > 9) {
            long c = value % 10;
            answer.val = Integer.parseInt("" + c);
            value /= 10;
            answer.next = intToListNode(value);
        }
        else {
            answer.val = Integer.parseInt("" + value);
        }
        return answer;
    }

    private long listNodeToInt(ListNode node1) {

        if (Objects.isNull(node1))
            return 0;
        long value = node1.val;
        long multi = 10;
        ListNode n = node1;
        while ((n = n.next) != null) {
            value += n.val * multi;
            multi *= 10;
        }
        return value;
    }

    private static final Logger log = LoggerFactory.getLogger(AddTwoNumbersTest.class);

    private void doTest(long target1,
                        long target2) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        final ListNode node1 = intToListNode(target1);
        final ListNode node2 = intToListNode(target2);
        ListNode answer = addTwoNumbers.addTwoNumbers(node1, node2);
        assertListNode(answer, (target2 + target1));
    }

    private void doTest2(long target1,
                         long target2) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers2();
        final ListNode node1 = intToListNode(target1);
        final ListNode node2 = intToListNode(target2);
        ListNode answer = addTwoNumbers.addTwoNumbers(node1, node2);
        assertListNode(answer, (target2 + target1));
    }

    private void assertListNode(ListNode node,
                                long value) {
        ListNode node1 = intToListNode(value);

        while (node != null && node1 != null) {
            Assert.assertEquals(node1.val, node.val);
            node = node.next;
            node1 = node1.next;
        }
        Assert.assertEquals(null, node1);
        Assert.assertEquals(null, node);
    }

    public class TestData {
        public TestData(long target1,
                        long target2) {
            this.target1 = target1;
            this.target2 = target2;
        }

        long target1;
        long target2;
    }
}