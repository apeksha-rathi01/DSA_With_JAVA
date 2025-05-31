package Lecture._06_Sorting;

import java.util.*;

public class DisappearedMissing {
    //CyclicSort Question LeetCode-448
    public static void main(String[] args) {

    }

    private List<Integer> findDisappearedNumbers(int[] arr) {

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
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int index, int corrIndex){
        int temp = arr[index];
        arr[index] = arr[corrIndex];
        arr[corrIndex] = temp;
    }
}
