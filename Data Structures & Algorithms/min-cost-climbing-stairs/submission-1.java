class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int [] dp = new int[cost.length];
        Arrays.fill(dp, -1);
       return Math.min(back(0, cost,dp),back(1, cost,dp));
    }

int back(int steps,int[] cost,int [] dp){

  if(steps>=cost.length)
  return 0;



   if (dp[steps] != -1)
            return dp[steps];

        dp[steps] =cost[steps]+Math.min( back(steps + 1,cost,dp) , back(steps + 2,cost,dp));

        return dp[steps];






}

}
