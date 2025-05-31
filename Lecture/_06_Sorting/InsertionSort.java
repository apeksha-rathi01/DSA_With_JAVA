package Lecture._06_Sorting;

import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int arr[]) {
         for(int i = 0; i < arr.length-1; i++){
             for(int j = i+1; j>0; j--){
                 if(arr[j]<arr[j-1]){
                     // use swap method:- swap(arr,j,j-1);
                     int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;
                 }else{
                     break;
                 }
             }
         }
    }
}
