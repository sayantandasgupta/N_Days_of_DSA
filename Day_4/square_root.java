package Day_4;

import java.util.*;

public class square_root{
    public static int squareRoot(int x){
        int start =1, end = x-1,mid,res=0;
        if(x==1)
            res = 1;
        while(start<=end){
            mid = start + (end-start)/2;
            if(mid>x/mid)
                end = mid-1;
            else{
                if(mid+1>x/(mid+1)){
                    res =mid;
                    break;
                }
                else
                    start = mid+1;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(squareRoot(x));
        sc.close();
    } 
}