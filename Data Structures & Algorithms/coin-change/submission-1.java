class Solution {
    // Use an Integer array so unvisited states are null
    Integer[] memo; 

    public int coinChange(int[] coins, int amount) {
        memo = new Integer[amount + 1];
        return dfs(coins, amount);
    }

    private int dfs(int[] coins, int amount) {
        // 1. Base cases
        if (amount == 0) return 0;
        if (amount < 0) return -1;
        
        // 2. Check memo cache
        if (memo[amount] != null) return memo[amount];

        int minCoins = Integer.MAX_VALUE;

        // 3. Loop through choices
        for (int coin : coins) {
            int subResult = dfs(coins, amount - coin);
            
            // Only update minCoins if the sub-path was actually possible
            if (subResult >= 0) {
                minCoins = Math.min(minCoins, 1 + subResult);
            }
        }

        // 4. Save to memo and return
        memo[amount] = (minCoins == Integer.MAX_VALUE) ? -1 : minCoins;
        return memo[amount];
    }
}