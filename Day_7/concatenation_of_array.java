/*
Problem Statement: Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
*/

package Day_7;

public class concatenation_of_array {
    static int[] solution(int[] nums){
        int n = nums.length;
        int[] res = new int[2*n];
        for(int i=0;i<2*n;i++)
            res[i] = 0; 
        for(int i=0;i<n;i++){
            res[i] = nums[i];
            res[i+n] = nums[i];
        }
        return res;    
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int[] res = solution(arr);

        for(int i=0;i<res.length;i++)
            System.out.println(res[i]);
    }
    
}
