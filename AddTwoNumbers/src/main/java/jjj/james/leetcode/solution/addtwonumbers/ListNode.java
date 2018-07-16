package jjj.james.leetcode.solution.addtwonumbers;

/**
 * @author jamesliao
 * @since 2017/1/19
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        if (next == null) {
            return String.valueOf(val);
        }
        return next.toString() + String.valueOf(val);
    }
}
