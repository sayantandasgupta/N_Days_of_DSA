/**

Problem Statement:- Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Input: nums = [2,0,2,1,1,0]
Output:- [0,0,1,1,2,2]

 */

package Day_14;

public class sort_colors {
    // O(n) a 2 pass solution. First count number of 0s, 1s and 2s, then replace them in the given array

    static int[] twoPassSolution(int[] nums){
        int count0=0, count1 = 0, count2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                count0++;
            else if(nums[i]==1)
                count1++;
            else
                count2++;
        }
        for(int i=0;i<nums.length;i++){
            if(i<count0)
                nums[i]=0;
            else if(i>=count0 && i<count0+count1)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        nums = twoPassSolution(nums);

        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i] + " ");
    }
}
