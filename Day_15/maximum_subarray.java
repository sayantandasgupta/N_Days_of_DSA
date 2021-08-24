/**
 * Problem Statement:- Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 
 * Input:- nums = [-2,1,-3,4,-1,2,1,-5,4]
 
 * Output:- 6
 
 * Solution is using Kadane's Algorithm
 */

package Day_15;

import java.util.Scanner;

public class maximum_subarray {
    static int solution(int[] arr){
        int max_so_far = arr[0], max_sum = 0;

        for(int i = 0;i<arr.length;i++){
            max_sum += arr[i];
            if(max_so_far<max_sum){
                max_so_far = max_sum;
            }
            if(max_sum<0)
                max_sum = 0;
        }

        return max_so_far;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the terms of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum Subarray sum: " + solution(arr));
        sc.close();
    }
}
