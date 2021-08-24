/**
 * Problem Statement:- Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Input:- nums = [1,2,3,1]
 * Output:- True
 */

package Day_15;

import java.util.*;

public class contains_duplicates {
    static boolean solution(int[] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        System.out.print(solution(arr));
    }
}
