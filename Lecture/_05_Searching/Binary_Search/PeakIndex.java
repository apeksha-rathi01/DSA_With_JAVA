package Lecture._05_Searching.Binary_Search;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        System.out.println(peakElement(arr));

    }
    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;

        if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start; // or return end;
    }
}
/*
We use binary search on the array:
Let start = 0 and end = arr.length - 1.
While start < end, calculate mid = start + (end - start) / 2.
Check arr[mid] with arr[mid + 1]:
If arr[mid] > arr[mid + 1], we are in the decreasing part, so the peak is at mid or to the left, hence set end = mid.
If arr[mid] < arr[mid + 1], we are in the increasing part, so the peak must be to the right, hence set start = mid + 1.
When the loop ends, start == end, pointing to the peak index.
 */
