/*
Problem Statement: Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

Input: arr = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
*/

package Day_7;

import java.util.*;

public class build_array_from_permutation{
    static int[] solution(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        for(int i =0;i<n;i++){
            ans[i] = arr[arr[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Resultant array = ");
        int res[] = solution(arr);
        for(int i =0;i<n;i++){
            System.out.println(res[i]);
        }
        sc.close();
    }
}