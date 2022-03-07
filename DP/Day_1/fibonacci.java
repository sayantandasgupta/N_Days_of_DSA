/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

    F(0) = 0, F(1) = 1
    F(n) = F(n - 1) + F(n - 2), for n > 1.

    Given n, calculate F(n).
 */

package DP.Day_1;

public class fibonacci {
    /**
     * Step 1:- Finding Recurrence Relation
     * 
     * Relation:-
     *      fibonacci(i) = fibonacci(i-1) + fibonacci(i-2)
     * Base Cases:-
     *      fibonacci(0) = 1
     *      fibonacci(1) = 1
    */

    /**
     * Step 2:- Convert the recurrence relation to a recursive function
     */

    public static int recursive_helper(int n) {
        if(n == 0 || n == 1) return 1;

        return recursive_helper(n-1) + recursive_helper(n-2);
    }

    /**
     * Step 2:- Optimization - Top Down DP, adding memoization to the recursive stack
     * Optimization is required for larger inputs
     */

     public static int dp_helper(int n, int[] dp) {
         if(n==0 || n == 1) return 1;       // BASE CASE
         
         if(dp[n] != 0) return dp[n];

         dp[n] = dp_helper(n-1, dp) + dp_helper(n-2, dp);

         return dp[n];
     }

    public static int fib(int n) {
        if(n==0 || n ==1) return 1;
        int[] dp = new int[n+1];

        // Assigning the BASE CASE scenarios
        dp[0] = 1;
        dp[1] = 1;
        return dp_helper(n, dp);
    }

    public static void main(String[] args) {
        System.out.print(fib(105));
    }

}