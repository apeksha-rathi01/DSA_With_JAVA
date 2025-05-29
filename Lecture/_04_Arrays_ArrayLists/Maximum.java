package Lecture._04_Arrays_ArrayLists;
import java.util.Arrays;

import static java.util.Collections.swap;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {04,12,26,2935};

        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,1));
    }
    static int max(int[] arr){
        if(arr.length == 0){
            int max = arr[0];
        }
        int max = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start, int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int max = arr[0];
        for(int i = start; i < end; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
