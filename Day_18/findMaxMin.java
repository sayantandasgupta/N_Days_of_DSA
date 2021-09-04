package Day_18;

public class findMaxMin {
    static class Pair{
        int max;
        int min;
    }

    static Pair findMaxMinNo(int[] arr, int n){
        Pair maxmin = new Pair();
        int i;

        if(n%2==0){
            if(arr[0]>arr[1]){
                maxmin.max = arr[0];
                maxmin.min = arr[1];
            }else{
                maxmin.max = arr[1];
                maxmin.min = arr[0];
            }
            i = 2;
        }else{
            maxmin.max = arr[0];
            maxmin.min = arr[0];
            i = 1;
        }

        while(i<n-1){
            if(arr[i]>arr[i+1]){
                if(arr[i]>maxmin.max)
                    maxmin.max = arr[i];
                if(arr[i+1]<maxmin.min)
                    maxmin.min = arr[i+1];
            }else{
                if(arr[i+1] > maxmin.max)
                    maxmin.max = arr[i+1];
                if(arr[i]<maxmin.min)
                    maxmin.min = arr[i];
            }

            i += 2;
        }

        return maxmin;
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};

        Pair res = findMaxMinNo(arr, arr.length);

        System.out.print("Max No = " + res.max + ", Min No = " + res.min);
    }
}
