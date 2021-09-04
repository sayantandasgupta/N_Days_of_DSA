package Day_18;

public class move_negative_to_one_end {
    static void solution(int[] arr){
        int j=1, i=0;
        while(i<arr.length && j<arr.length){
            if(arr[j]<0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        solution(arr);
        
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
