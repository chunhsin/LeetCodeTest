package jjj.james.leetcode.solution.addtwonumbers;

import java.util.Objects;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 *
 * @author jamesliao
 * @since 2017/1/19
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1,
                                  ListNode l2) {

        if (isZero(l1))
            return checkIfMoreThanTen(l2);

        if (isZero(l2))
            return checkIfMoreThanTen(l1);

        ListNode answer = new ListNode(0);
        if (Objects.isNull(l1) && Objects.isNull(l2)) {
            return null;
        }
        else if (Objects.nonNull(l1) && Objects.nonNull(l2)) {

            int val = l1.val + l2.val;

            boolean valMoreThan9 = val > 9;
            answer.val = valMoreThan9 ? val - 10 : val;
            if (valMoreThan9) {
                if (Objects.nonNull(l1.next) && Objects.nonNull(l2.next)) {
                    l1.next.val++;
                    answer.next = this.addTwoNumbers(l1.next, l2.next);
                }
                else if (Objects.isNull(l1.next) && Objects.isNull(l2.next)) {
                    answer.next = new ListNode(1);
                }
                else if (Objects.isNull(l1.next)) {
                    l2.next.val += 1;
                    answer.next = this.addTwoNumbers(new ListNode(0), l2.next);
                }
                else {
                    l1.next.val += 1;
                    answer.next = this.addTwoNumbers(l1.next, new ListNode(0));
                }
            }
            else {
                answer.next = this.addTwoNumbers(l1.next, l2.next);
            }
        }
        else if (Objects.isNull(l1)) {
            if (l2.val > 9) {
                answer.val = l2.val - 10;
                if (Objects.nonNull(l2.next))
                    answer.next = this.addTwoNumbers(new ListNode(1), l2.next);
                else
                    answer.next = new ListNode(1);
            }
            else {
                answer.next = this.addTwoNumbers(new ListNode(0), l2.next);
            }
        }
        else {
            answer.val = l1.val;
            answer.next = this.addTwoNumbers(l1.next, l2);
        }
        return answer;
    }

    public ListNode checkIfMoreThanTen(ListNode node) {
        if (Objects.isNull(node))
            return null;
        if (node.val > 9) {
            node.val = node.val - 10;
            if (Objects.nonNull(node.next))
                node.next = this.addTwoNumbers(new ListNode(1), node.next);
            else
                node.next = new ListNode(1);
        }
        return node;
    }

    public boolean isZero(ListNode node) {
        if (Objects.isNull(node))
            return true;
        if (Objects.isNull(node.next) && node.val == 0)
            return true;

        return false;
    }

}
