/*
Problem Statement: There is a hidden integer array arr that consists of n non-negative integers.

It was encoded into another integer array encoded of length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer exists and is unique.

Input: encoded = [1,2,3] first = 1
Output: arr = [1,0,2,1]

*/

package Day_11;

public class decode_XORed_array {

    static int[] solution(int[] encoded, int first){
        int[] arr = new int[encoded.length+1];
        arr[0] = first;

        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i-1]^encoded[i-1];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] encoded = {6,2,7,3};
        int first = 4;

        int[] res = solution(encoded, first);

        for(int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
    
}
