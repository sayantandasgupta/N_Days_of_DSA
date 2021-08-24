/**
 Problem Statement: Given two arrays of integers nums and index. Your task is to create target array under the following rules:

                    Initially target array is empty.
                    From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
                    Repeat the previous step until there are no elements to read in nums and index.
                    Return the target array.

                    It is guaranteed that the insertion operations will be valid.

 Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 Ouput: [0,4,1,3,2]
 */

package Day_13;

import java.util.*;

public class create_target_Array_in_given_order {
    // O(n^2) time complexity solution
    static int[] solution1(int[] nums, int[] index){
        int[] target = new int[nums.length];

        for(int i=0;i<index.length;i++){
            for(int j=(nums.length)-1;j>index[i];j--)
                target[j] = target[j-1];
            target[index[i]] = nums[i];
        }

        return target;
    }

    // O(n) time complexity solution
    static int[] solution2(int[] nums, int[] index){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            arr.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i] = arr.get(i);
        }

        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] target = solution2(nums, index);

        for(int i=0;i<target.length;i++){
            System.out.print(target[i]+" ");
        }
    }
}