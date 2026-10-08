class Solution {

    public char kthCharacter(int k) {
        return solve(k);
    }

    private char solve(int k) {

        // Base case
        if (k == 1) {
            return 'a';
        }

        // Find the previous word's length
        int half = 1;

        while (half * 2 < k) {
            half *= 2;
        }

        // k is in the first half
        if (k <= half) {
            return solve(k);
        }

        // k is in the second half
        return (char)(solve(k - half) + 1);
    }
}