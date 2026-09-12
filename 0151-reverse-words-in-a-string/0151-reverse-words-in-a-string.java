class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();

        reverse(words, words.length - 1, ans);

        return ans.toString();
    }

    void reverse(String[] words, int i, StringBuilder ans) {
        if (i < 0) {
            return;
        }

        ans.append(words[i]);

        if (i != 0) {
            ans.append(" ");
        }

        reverse(words, i - 1, ans);
    }
}