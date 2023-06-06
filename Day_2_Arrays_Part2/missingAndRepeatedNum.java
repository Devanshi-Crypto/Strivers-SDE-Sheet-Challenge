package Day_2_Arrays_Part2;
import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class missingAndRepeatedNum {
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        int[] result = new int[2];
        int[] count = new int[n + 1];

        // Calculate the count of each number
        for (int num : arr) {
            count[num]++;
        }

        // Find the missing and repeating numbers
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) {
                result[1] = i; // Repeating number
            } else if (count[i] == 0) {
                result[0] = i; // Missing number
            }
        }

        return result;
    }
}
