/*
Problem Statement: Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

Input: nums = [1,2,3,1,1,3]
Output: 4

Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/

package Day_9;

import java.util.Scanner;

public class number_of_good_pairs {
    static int solution(int[] arr){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the terms of the array: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int res = solution(nums);
        System.out.println("Number of good pairs is: " + res);
        sc.close();
    }
    
}
