/**
 * Problem Statement:- Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

 * To flip an image horizontally means that each row of the image is reversed.

 * For example, flipping [1,1,0] horizontally results in [0,1,1].
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

 * For example, inverting [0,1,1] results in [1,0,0].
 * 
 * Input:- image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output:- [[1,0,0],[0,1,0],[1,1,1]]
 */

package Day_16;
import java.util.*;

public class flipping_an_image {
    static int[][] solution(int[][] image){
        for(int i=0;i<image.length;i++){
            int n=image[i].length;
            for(int j=0;j<n/2;j++){
                int temp = image[i][j];
                image[i][j] = image[i][n-j-1];
                image[i][n-j-1] = temp;
            }

            for(int j=0;j<n;j++){
                image[i][j] = image[i][j]==0? 1 : 0;
            }
        }

        return image;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] image = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Image:- \n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Inverted Image:- \n");

        image = solution(image);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
