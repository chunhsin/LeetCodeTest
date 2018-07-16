package jjj.james.leetcode.solution.addtwonumbers;

/**
 * @author jamesliao
 * @since 2017/1/20
 */
public class AddTwoNumbers2 extends AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1,
                                  ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode p = l1, q = l2, curr = answer;
        int carry = 0;
        while (p != null || q != null) {
            int pVal = p == null ? 0 : p.val;
            int qVal = q == null ? 0 : q.val;
            int val = pVal + qVal + carry;
            carry = val / 10;
            curr.next = new ListNode(val % 10);
            curr = curr.next;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return answer.next;
    }
}
