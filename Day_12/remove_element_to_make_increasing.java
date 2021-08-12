/*
Problem Statement: Given a 0-indexed integer array nums, return true if it can be made strictly increasing after removing exactly one element, or false otherwise. If the array is already strictly increasing, return true.

The array nums is strictly increasing if nums[i - 1] < nums[i] for each index (1 <= i < nums.length).

Input: nums = [1,2,10,5,7]
Output: true
Explanation: By removing 10 at index 2 from nums, it becomes [1,2,5,7].
[1,2,5,7] is strictly increasing, so return true.

 */

package Day_12;

public class remove_element_to_make_increasing {
    static boolean solution(int[] nums){
        boolean removed = false;
        for(int i=1;i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                if(removed) return false;
                removed = true;
                if(i>1 && nums[i]<=nums[i-2])
                    nums[i] = nums[i-1];
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,10,5,7};
        System.out.println(solution(arr));
    }
}
