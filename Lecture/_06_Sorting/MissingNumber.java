package Lecture._06_Sorting;

import java.util.Arrays;

public class MissingNumber {
    //CyclicSort Question LeetCode-268
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        System.out.print(missingNum(arr));
    }

    private static int missingNum(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int corrIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[corrIndex]){
                swap(arr,i,corrIndex);
            }else{
                i++;
            }
        }
        for(int index= 0 ; index < arr.length; index++){
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int index, int corrIndex){
        int temp = arr[index];
        arr[index] = arr[corrIndex];
        arr[corrIndex] = temp;
    }
}
