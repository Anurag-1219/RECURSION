class Solution {

    public List<Integer> solve(String exp) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if (ch == '+' || ch == '-' || ch == '*') {

                List<Integer> left = solve(exp.substring(0, i));
                List<Integer> right = solve(exp.substring(i + 1));

                for (int l : left) {
                    for (int r : right) {

                        if (ch == '+') {
                            result.add(l + r);
                        } else if (ch == '-') {
                            result.add(l - r);
                        } else {
                            result.add(l * r);
                        }

                    }
                }
            }
        }

        if (result.isEmpty()) {
            result.add(Integer.parseInt(exp));
        }

        return result;
    }

    public List<Integer> diffWaysToCompute(String exp) {
        return solve(exp);
    }
}