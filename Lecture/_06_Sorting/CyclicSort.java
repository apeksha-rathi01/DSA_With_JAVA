package Lecture._06_Sorting;

import java.util.*;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclicSort(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int index, int corrIndex){
        int temp = arr[index];
        arr[index] = arr[corrIndex];
        arr[corrIndex] = temp;
    }
}
