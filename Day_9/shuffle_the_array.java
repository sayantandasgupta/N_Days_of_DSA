/*
Problem Statement: Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Input: nums = [1,2,3,4,5,6] n = 3
Output: [1,4,2,5,3,6]
*/

package Day_9;
import java.util.*;

public class shuffle_the_array {
    static int[] solution(int[] nums, int n){
        int[] res = new int[2*n];
        int idx=0,i=0,j=n;
        while(idx<2*n){
            res[idx++] = nums[i];
            res[idx++] = nums[j];
            i++;
            j++;
        } 

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] nums = new int[2*n];
        System.out.println("Enter the terms of the array: ");
        for(int i=0;i<2 * n;i++){
            nums[i] = sc.nextInt();
        }
        int[] res = solution(nums,n);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
