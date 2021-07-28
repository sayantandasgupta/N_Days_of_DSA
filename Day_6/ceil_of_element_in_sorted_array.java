/*
Problem Statement: Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and the floor is the greatest element smaller than or equal to x. Assume than the array is sorted in non-decreasing order. Write efficient functions to find floor and ceiling of x. 
            Input: arr = [1, 2, 8, 10, 10, 12, 19], val = 0
           Output: 1 
*/

package Day_6;

public class ceil_of_element_in_sorted_array {
    static int solution(int[] arr, int val){
        int start=0, end=arr.length-1, mid, res =-1;
        while(start<=end){
            mid = start + (end-start)/2;
            //check whether mid element is equal to val
            if(arr[mid] == val){
                res = arr[mid];
                break;
            }
            //Check whether mid element is lesser than val
            else if(arr[mid]<val){
                start = mid+1;
            }
            //finally if mid element is greater than val, check whether there is any element less than mid and greater than val
            else{
                res = arr[mid];
                end = mid-1;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int val = 5;

        System.out.println(solution(arr, val));
    }
}
