class Solution {

    void solve(int num, int n, List<Integer> output) {

        if (num > n) {
            return;
        }

        output.add(num);

        for (int i = 0; i <= 9; i++) {
            solve(num * 10 + i, n, output);
        }
    }

    public List<Integer> lexicalOrder(int n) {

        List<Integer> output = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            solve(i, n, output);
        }

        return output;
    }
}