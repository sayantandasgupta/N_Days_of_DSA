/*
Problem Statement: Given a string s and an integer array indices of the same length.

The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.

Input: s = "codeleet" indices=[4,5,6,7,0,2,1,3]
Output: "leetcode"`
*/

package Day_10;

import java.util.*;

public class shuffle_string {

    static String solution(String s, int[] indices){
        Map<Integer, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.putIfAbsent(indices[i], s.charAt(i));
        }
        String s1="";
        for(int i=0;i<s.length();i++){
            s1 += map.get(i);
        }
        
        return s1;
    }
    public static void main(String[] args) {
        String s = "aaiougrt";
        int[] indices = {4,0,2,6,7,3,1,5};
        s = solution(s, indices);
        System.out.println(s);
    }
}
