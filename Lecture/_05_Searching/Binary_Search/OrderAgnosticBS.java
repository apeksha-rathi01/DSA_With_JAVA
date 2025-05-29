package Lecture._05_Searching.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[] = {90, 80, 70, 60, 50, 40, 30, 20, 10};
        int target = 50;
        int result = orderAgnosticBS(arr, target);

        if (result != -1) {
            System.out.println("Element Found at index: " + result);
        } else {
            System.out.println("Element Not Found.");
        }
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
