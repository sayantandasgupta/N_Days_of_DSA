/**
 * PROBLEM STATEMENT:-
 * You are a professional robber planning to rob houses along a street. 
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected,
 * and it will automatically contact the police if two adjacent houses were broken into on the same night.

 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * 
 * Example 1:

    * Input: nums = [1,2,3,1]
    * Output: 4
    * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
    * Total amount you can rob = 1 + 3 = 4.

 */

package DP.Day_2;

import java.util.Arrays;

public class house_robber {

    /**
     * Step 1:- Find recurrence relation
     * 
     * For this problem, one can notice that for current house i, the robber has 2 choices / decisions ( ref. Aditya Verma )
     * a. Rob the house, or b. Do not rob the house.
     * If he robs the house, then he cannot rob house i-1, but can safely go to rob house i - 2
     * 
     * Recurrence Relation:-
     *      rob(i) = max( rob(i-2) + nums[i], rob(i-1) )
     * Base Case:-
     *      No value should be less than 0, therefore if i < 0, rob(i) = 0
     */

    /**
     * Step 2:- Convert Recurrence Relation to Recursion
     */

     public static int recurrence_helper(int[] nums, int i) {
         if(i < 0) return 0;

         return Math.max(recurrence_helper(nums, i-2) + nums[i], recurrence_helper(nums, i-1));
     }

     /**
      * Step 3:- Optimization - Adding Memoization to recursion - Top Down 
      */

      public static int dp_helper(int[] nums, int i, int[] dp) {
          if(i < 0) return 0;
          if(dp[i] != -1) return dp[i];
          int res = Math.max(dp_helper(nums, i-2, dp) + nums[i], dp_helper(nums, i-1, dp));
          dp[i] = res;
          return res;
      }

      /**
       * Step 3:- More Optimization - Bottom Up approach => Convert Recursion to Iteration So that recursive stack is not used and 
       * Space Complexity is O(1)
       */
      public static int dp_iterative(int[] nums, int[] dp) {
          if(nums.length == 0) return 0;

          for(int i=1;i<nums.length;i++) {
              int val = nums[i];
              dp[i+1] = Math.max(dp[i], dp[i-1] + val);
          }

          return dp[nums.length];
      }

     public static int solution(int[] nums) {
         if(nums.length == 0) return 0;
         int[] dp = new int[nums.length + 1];
         Arrays.fill(dp, -1);
         dp[0] = 0;
         dp[1] = nums[0];
         return dp_iterative(nums, dp);
     }

     public static void main(String[] args) {
         int[] nums = {2,7,9,3,1};
         System.out.print(solution(nums));
     }
}
