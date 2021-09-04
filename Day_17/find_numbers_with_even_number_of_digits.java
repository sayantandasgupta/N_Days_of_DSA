/**
 * Problem Statement:- Given an array nums of integers, return how many of them contain an even number of digits.
 * Input:- nums = [12,345,2,6,7896]
 * Output:- 2
 */

package Day_17;

public class find_numbers_with_even_number_of_digits {
    // O(N^2) time complexity solution
    static int solution1(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int temp = arr[i], num = 0;
            while(temp>0){
                num++;
                temp /= 10;
            }
            if(num%2==0)
                count++;
        }

        return count;
    }

    // O(N) solution
    // Considering the ranges containing even number of digits,i.e., 10-99, 1000-9999 and 100000  
    static int solution2(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]>9 && arr[i]<100) || (arr[i]>999 && arr[i]<10000) || (arr[i] == 100000))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};

        System.out.println(solution2(arr));
    }
}
