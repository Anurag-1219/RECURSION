class Solution {

    public void reclist(ArrayList<ListNode> nums, int left, int right) {

        if (left >= right) {
            nums.get(left).next = null;
            return;
        }

        nums.get(left).next = nums.get(right);

        if (left + 1 == right) {
            nums.get(right).next = null;
            return;
        }

        nums.get(right).next = nums.get(left + 1);

        reclist(nums, left + 1, right - 1);
    }

    public void reorderList(ListNode head) {

        ArrayList<ListNode> nums = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            nums.add(curr);
            curr = curr.next;
        }

        int left = 0;
        int right = nums.size() - 1;

        reclist(nums, left, right);
    }
}