/**
 * Problem Statement: A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true


 */

package Day_14;

import java.util.*;

public class check_if_sentence_is_pangram {
    static boolean solution(String sentence){
        HashSet<Character> distinctChar = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            distinctChar.add(sentence.charAt(i));
        }

        if(distinctChar.size()==26)
            return true;
        return false;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(solution(sentence));
    }
}
