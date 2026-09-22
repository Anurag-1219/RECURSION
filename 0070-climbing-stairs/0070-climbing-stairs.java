class Solution {

    public int climb(int n, int step, int[] dp) {

        if (step == n) {
            return 1;
        }

        if (step > n) {
            return 0;
        }

       
        if (dp[step] != -1) {
            return dp[step];
        }

        dp[step] = climb(n, step + 1, dp)
                 + climb(n, step + 2, dp);

        return dp[step];
    }

    public int climbStairs(int n) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return climb(n, 0, dp);
    }
}