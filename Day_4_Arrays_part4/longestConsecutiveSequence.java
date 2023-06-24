
import java.util.*;
public class longestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0)
            return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 1;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;

    }
}