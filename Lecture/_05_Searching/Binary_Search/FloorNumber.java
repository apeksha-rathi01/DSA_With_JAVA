package Lecture._05_Searching.Binary_Search;

public class FloorNumber {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floorNum(arr,target));
    }
    // return the index: greatest number <= target
    static int floorNum(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return end;
    }
}
