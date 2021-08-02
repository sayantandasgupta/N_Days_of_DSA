/*
Problem Statement: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Input: nums = [3,2,4], target = 6
Output: [1,2]
*/

package Day_8;

import java.util.*;

public class two_sum {
    static int[] solution(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i =0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i)
                return new int[] {i, map.get(complement)};
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the terms of the array: ");
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int[] res = solution(nums, target);
        System.out.print("Required Indices are:");
        for(int i=0;i<res.length;i++)
            System.out.print(res[i] + " ");
        sc.close();
    }
}
