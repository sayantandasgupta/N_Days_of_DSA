/*
Problem Statement: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
*/

package Day_8;

import java.util.Scanner;

public class richest_customer_wealth {
    static int solution(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++){
                sum += accounts[i][j];
            }
            max = Integer.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i=0;i<m;i++){
            System.out.println("Enter wealth of " + (i+1) + "th customer:");
            for(int j=0;j<n;j++){
                accounts[i][j] = sc.nextInt();
            }
        }
        int res = solution(accounts);
        System.out.println("Maximum Wealth = " + res);
        sc.close();
    }
}
