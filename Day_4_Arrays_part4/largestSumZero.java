import java.util.*;
public class largestSumZero {
 
    public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
        int n = arr.size();
        int maxLength = 0;
        Map<Integer, Integer> sumMap = new HashMap<>(); // Map to store cumulative sum and its corresponding index
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr.get(i);

            // If the sum is zero, the subset starts from the beginning
            if (sum == 0) {
                maxLength = i + 1;
            }

            // If the sum is already present in the map, it means a subset with zero sum
            // exists
            if (sumMap.containsKey(sum)) {
                int length = i - sumMap.get(sum);
                if (length > maxLength) {
                    maxLength = length;
                }
            } else {
                // Store the cumulative sum and its index in the map
                sumMap.put(sum, i);
            }
        }

        return maxLength;
    }

}
