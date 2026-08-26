class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];

        int i = 0;
        int j = n;
        int k = 0;

        while (i < n) {
            ans[k] = nums[i];
            ans[k + 1] = nums[j];

            i++;
            j++;
            k += 2;
        }

        return ans;
    }
}