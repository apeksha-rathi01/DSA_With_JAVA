package Lecture._05_Searching.Binary_Search;

import java.util.Arrays;

public class First_LastPos {
    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 7, 7, 8, 8, 9};
        int target = 7;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        return new int[] {first, last};
    }

    private static int findPosition(int[] nums, int target, boolean findFirst) {
        int start = 0, end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                result = mid;
                if (findFirst) {
                    end = mid - 1; // go left
                } else {
                    start = mid + 1; // go right
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }
}
