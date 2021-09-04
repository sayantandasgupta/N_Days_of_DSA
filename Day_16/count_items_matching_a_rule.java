/**
 * Problem Statement:- You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.

 * The ith item is said to match the rule if one of the following is true:

 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.

 * Input:- items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * Output:- 1
 * Explanation:- There is only one item matching the given rule, which is ["computer","silver","lenovo"].

 */

package Day_16;
import java.util.*;

public class count_items_matching_a_rule{
    static int solution(List<List<String>> items, String ruleKey, String ruleValue){
        int count = 0;
        for(int i=0;i<items.size();i++){
            List<String> x = items.get(i);
            if(ruleKey.equals("type") && x.get(0).equals(ruleValue)){
                count++;
            } 
            if(ruleKey.equals("color") && x.get(1).equals(ruleValue)){
                count++;
            }
            if(ruleKey.equals("name") && x.get(2).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<String>> items = new ArrayList<List<String>>();
        for(int i=0;i<3;i++){
            items.add(new ArrayList<String>(3));
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                items.get(i).add(i, sc.nextLine());
            }
        }

        System.out.println(solution(items, "color", "silver"));
        sc.close();
    }
}