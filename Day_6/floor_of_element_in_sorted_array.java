/*

Problem Statement: Given a sorted array and a value x, the floor of x is the largest element in array smaller than or equal to x. Write efficient functions to find floor of x.
            Input: arr = {1, 2, 8, 10, 10, 12, 19}, x = 5
           Output: 2 (Maximum number less than 5 since 5 does not exist inside the array) 

*/

package Day_6;

public class floor_of_element_in_sorted_array {
    static int solution(int[] arr, int val){
        int start =0, end = arr.length-1,mid,res=-1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]==val){
                res = arr[mid];
                break;
            }
            else if(arr[mid]>val){
                end = mid-1;
            }
            else{
                res = arr[mid];
                start = mid+1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int val = 20;

        System.out.println(solution(arr,val));
    }    
}
