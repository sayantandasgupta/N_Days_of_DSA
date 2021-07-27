/*
LeetCode problem : Find Pivot Index

Problem Statement: Given an array of integers nums, calculate the pivot index of this array.

                   The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

                   If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

                   Return the leftmost pivot index. If no such index exists, return -1.
            Input: nums = [1,7,3,6,5,6]
           Output: 3 

*/

package Day_5;

public class find_pivot_index {

    static int solution(int[] arr){

        int prefixSum[] = new int[arr.length];
        int suffixSum[] = new int[arr.length];

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            prefixSum[i] = sum;
        }

        sum = 0;
        for(int i= arr.length-1;i>=0;i--){
            sum += arr[i];
            suffixSum[i] = sum;
        }

        for(int i =0;i<arr.length;i++){
            if(prefixSum[i] == suffixSum[i])
                return i;
        }

        return -1;
    }
    
    public static void main(String[] args){
        int[] arr = {2,1,-1};

        System.out.println(solution(arr));
    }
}
