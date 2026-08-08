class Solution {

    ListNode left;

    boolean solve(ListNode right) {

        if (right == null) {
            return true;
        }

        boolean ans = solve(right.next);

        if (!ans) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        left = left.next;

        return true;
    }

    public boolean isPalindrome(ListNode head) {

        left = head;

        return solve(head);
    }
}