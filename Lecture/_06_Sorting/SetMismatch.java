package Lecture._06_Sorting;

import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                return new int[]{arr[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int index, int corrIndex){
        int temp = arr[index];
        arr[index] = arr[corrIndex];
        arr[corrIndex] = temp;
    }
}
