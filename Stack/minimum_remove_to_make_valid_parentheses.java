package Stack;

import java.util.*;

public class minimum_remove_to_make_valid_parentheses {
    public static void main(String[] args) {
        String s = "lee(t(c)o)de)";

        String res = solution(s);

        System.out.print(res);
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<sb.length();i++){
            char c = sb.charAt(i);

            if(c == '('){
                stack.push(i);
            }

            if(c == ')'){
                if(!stack.isEmpty()) stack.pop();
                else sb.setCharAt(i, '*');
            }
        }

        while(!stack.isEmpty()){
            sb.setCharAt(stack.pop(), '*');
        }

        return sb.toString().replaceAll("\\*", "");
    }
}