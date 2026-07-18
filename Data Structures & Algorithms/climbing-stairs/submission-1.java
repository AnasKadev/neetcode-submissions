class Solution {

    Integer[] memo;

    public int climbStairs(int n) {
        memo = new Integer[n + 1];
        return back(n);
    }

    int back(int curr) {

        if (curr < 0)
            return 0;

        if (curr == 0)
            return 1;

        if (memo[curr] != null)
            return memo[curr];

        memo[curr] = back(curr - 1) + back(curr - 2);

        return memo[curr];
    }
}