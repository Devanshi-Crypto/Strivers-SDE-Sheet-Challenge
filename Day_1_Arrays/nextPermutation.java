public class nextPermutation {

    public static void generateNextPermutation(int[] nums) {
        int n = nums.length;

        // Step 1: Find the first pair (i, i+1) such that nums[i] < nums[i+1]
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: If there is no such pair, reverse the array
        if (i < 0) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the smallest element in the suffix nums[i+1:] that is greater
        // than nums[i]
        int j = n - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }

        // Step 4: Swap nums[i] with nums[j]
        swap(nums, i, j);

        // Step 5: Reverse the suffix nums[i+1:]
        reverse(nums, i + 1, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



}

//approach 2 - array collections
/*
 * import java.util.* ;
 * import java.io.*;
 * import java.util.ArrayList;
 * import java.util.Collections;
 * 
 * public class Solution {
 * public static ArrayList<Integer> nextPermutation(ArrayList<Integer>
 * permutation) {
 * int n = permutation.size();
 * 
 * // Step 1: Find the first pair (i, i+1) such that permutation[i] <
 * permutation[i+1]
 * int i = n - 2;
 * while (i >= 0 && permutation.get(i) >= permutation.get(i + 1)) {
 * i--;
 * }
 * 
 * // Step 2: If there is no such pair, reverse the entire permutation
 * if (i < 0) {
 * Collections.reverse(permutation);
 * return permutation;
 * }
 * 
 * // Step 3: Find the smallest element in the suffix permutation[i+1:] that is
 * greater than permutation[i]
 * int j = n - 1;
 * while (j > i && permutation.get(j) <= permutation.get(i)) {
 * j--;
 * }
 * 
 * // Step 4: Swap permutation[i] with permutation[j]
 * Collections.swap(permutation, i, j);
 * 
 * // Step 5: Reverse the suffix permutation[i+1:]
 * int left = i + 1;
 * int right = n - 1;
 * while (left < right) {
 * Collections.swap(permutation, left, right);
 * left++;
 * right--;
 * }
 * 
 * return permutation;
 * }
 * }
 * 
 */