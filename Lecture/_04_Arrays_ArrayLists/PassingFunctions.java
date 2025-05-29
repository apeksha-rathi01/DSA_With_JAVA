package Lecture._04_Arrays_ArrayLists;
import java.util.Scanner;
import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {04,12,26,29,35};
        System.out.println("Original Array: \n"+Arrays.toString(arr));
        change(arr);
        System.out.println("Change Array: \n"+Arrays.toString(arr));
    }

    static void change(int[] arr) {
        arr[1] = 13;
    }
}
