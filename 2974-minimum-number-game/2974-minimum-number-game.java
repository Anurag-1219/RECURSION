class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);
        }

        int[] arr = new int[nums.length];
        int i = 0;

        while (!pq.isEmpty()) {
            int alice = pq.poll();
            int bob = pq.poll();

            arr[i++] = bob;
            arr[i++] = alice;
        }

        return arr;
    }
}