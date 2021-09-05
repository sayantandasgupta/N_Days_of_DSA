/**
 * Problem Statement:- Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted. It may be assumed that elements in both array are distinct.
 * You don't need to read input or print anything. Your task is to complete the function isSubset() which takes the array a1[], a2[], its size n and m as inputs and return "Yes" if arr2 is subset of arr1 else return "No" if arr2 is not subset of arr1.
 * Input:- a1[] = {1, 2, 3, 4, 5, 6}
 * a2[] = {1, 2, 4}
 * Output:- Yes
 */

package Day_19;

import java.util.*;

public class array_subset_of_another_array{
    static String onePassSolution(long[] a1, long n, long[] a2, long m){
        long count=0;
        int i=0,j=0;
        Arrays.sort(a1);
        Arrays.sort(a2);

        while(i<n && j<m){
            if(a1[i] == a2[j]){
                count++;
                i++;
                j++;
            }else if(a1[i]<a2[j]){
                i++;
            }else{
                j++;
            }
        }

        return count==m? "Yes":"No";
    }

    public static void main(String[] args) {
        long[] a1 = {1, 2, 3, 4, 5, 6};
        long[] a2 = {1, 2, 4};

        System.out.print(onePassSolution(a1, a1.length, a2, a2.length));
    }
}