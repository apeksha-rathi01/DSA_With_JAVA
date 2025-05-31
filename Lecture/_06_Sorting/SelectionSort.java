package Lecture._06_Sorting;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int arr[]) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
