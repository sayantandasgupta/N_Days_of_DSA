package Day_14;
import java.util.*;

public class number_of_unique_elements_in_array {
    static int solution(int[] arr){
        HashSet<Integer> distinct = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            distinct.add(arr[i]);
        }
        return distinct.size();
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20};

        System.out.println(solution(arr));
    }
}
