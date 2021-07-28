/*
Problem Statement: Given an array which is sorted, but after sorting some elements are moved to either of the adjacent positions, i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient function to search an element in this array. Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1].
                   For example consider the array {2, 3, 10, 4, 40}, 4 is moved to next position and 10 is moved to previous position.

            Input: arr = [10, 3, 40, 20, 50, 80, 70], val = 40
           Output: 2 
            
*/

package Day_6;

public class search_in_nearly_sorted_array {

    static int searchNearlySorted(int[] arr, int x){
        int n  = arr.length;
        int start = 0, end = n - 1, mid;
        while(start<=end){
            mid= start + (end-start)/2;
            if(arr[mid]==x)
                return mid;
            else if(mid >= start && arr[mid -1] == x)
                return mid-1;
            else if(mid <= end && arr[mid+1]==x)
                return mid+1;
            else if(arr[mid] > x)
                end = mid -2;
            else
                start = mid+2;
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 3, 40, 20, 50, 80, 70};
        int val = 90;

        System.out.println(searchNearlySorted(arr, val));
    }
    
}
