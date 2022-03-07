/**
 * The Tribonacci sequence Tn is defined as follows: 

    T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

    Given n, return the value of Tn.
 */

package DP.Day_1;

import java.util.Arrays;

public class tribonacci {

    /**
     * Step 1: Find the recurrence relation
     * Relation:-
     *      tribonacci(i) = tribonacci(i-1) + tribonacci(i-2) + tribonacci(i-3)
     * Base Case:-
     *      tribonacci(0) = 0
     *      tribonacci(1) = 1
     *      tribonacci(1) = 1
     */

     public static int trib(int n) {
         if(n==0) return 0;
         if(n==1 || n==2) return 1;

         int[] dp = new int[n+1];
         Arrays.fill(dp, -1);

         dp[0] = 0;
         dp[1] = 1;
         dp[2] = 1;
         return dp_helper(n, dp);
     }

    /**
     * Step 2: Convert recurrence relation to recursive function
     */

     public static int recursion_helper(int n){
         if(n==0) return 0;     
         if(n==1 || n == 2) return 1;   // BASE CASES

         return recursion_helper(n-1) + recursion_helper(n-2) + recursion_helper(n-3);
     }

     /**
      * Step 3: Optimization - DP approach - Adding memoization to recursion
      */

      public static int dp_helper(int n, int[] dp) {
          if(n==0) return 0;
          if(n==1 || n == 2) return 1;

          if(dp[n] != -1) return dp[n];

          dp[n] = dp_helper(n-1, dp) + dp_helper(n-2, dp) + dp_helper(n-3, dp);
          return dp[n];
      }

     public static void main(String[] args) {
         System.out.print(trib(25));
     }
    
}
