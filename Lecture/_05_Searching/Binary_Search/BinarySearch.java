package Lecture._05_Searching.Binary_Search;
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,9,11,23,45,67,89,90};
        int target = 100;
        System.out.println(binarySearch(arr,target));

    }
    //return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            // int mid = (start+end)/2;  // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if(arr[mid]==target){
                System.out.println("Element Found at index: ");
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        if(start > end){
            System.out.println("Element not found.");
        }
        return -1;
    }
}