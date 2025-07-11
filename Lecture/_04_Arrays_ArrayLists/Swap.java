package Lecture._04_Arrays_ArrayLists;
import java.util.Arrays;

import static java.util.Collections.swap;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {4,12,26,29,35};
//        swap(arr,1,3);
//        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) { //Reverse by using two pointer method.
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}