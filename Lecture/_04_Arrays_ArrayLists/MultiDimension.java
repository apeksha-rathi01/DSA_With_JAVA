package Lecture._04_Arrays_ArrayLists;
import java.util.*;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         1 2 3
         4 5 6
         7 8 9

         SYNTAX for 2-D Array:-
         datatype variable_name[][] = new datatype[][];
         */

        /* int arr[][] = new int[3][];
        In 2-D individual size of an object also define.
         */
        int arr1[][] = {
                {1,2,3}, //0th index
                {4,5}, //1st index
                {6,7,8,9} //2nd index -> arr[2] = {6,7,8,9};
                };

        //LENGTH
        int[][] arr = new int[3][3];
        //System.out.println(arr.length);

        //INPUT
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            System.out.println("Please enter values for Row: "+row);
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // OUTPUT
        // 1
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length /* size of row */ ; col++) {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // 2
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

//        for(int[] a : arr) {
//            System.out.println(Arrays.toString(a));
//        }
    }
}
