/*
Problem Statement: Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]

*/

package Day_10;
import java.util.*;

public class count_of_smaller_numbers {

    /*
    Brute Force approach: Time Complexity = O(n^2)
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(j!=i && nums[j]<nums[i])
                    count++;
            }
            res[i] = count;
        }
        return res;
    }
    */

    // Optimised approach: Time Complexity = O(n)

    static int[] solution(int[] nums){
        Map<Integer, Integer> count = new HashMap<>();
        int[] copy = nums.clone();
        int[] res = new int[nums.length];

        Arrays.sort(copy);

        for(int i=0;i<copy.length;i++){
            count.putIfAbsent(copy[i], i);
        }

        for(int i=0;i<nums.length;i++){
            res[i] = count.get(nums[i]);
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] res = solution(nums);
        for(int i=0;i<nums.length;i++)
            System.out.println(res[i]);
    }
}
