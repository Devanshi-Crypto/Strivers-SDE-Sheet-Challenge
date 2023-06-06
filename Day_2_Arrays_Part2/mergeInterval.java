package Day_2_Arrays_Part2;

import java.util.*;

public class mergeInterval {
    
    public static int[][] merge(int[][] intervals) {
        List<int[]> mergeIntervals = new ArrayList<>();
        int[] currentIntervals = null;

        for(int[] interval : intervals) {
            if(currentIntervals==null || interval[0]>currentIntervals[1]) {
                mergeIntervals.add(interval);
                currentIntervals = interval;
            }
            else{
                currentIntervals[1] = Math.max(currentIntervals[1], interval[1]);
            }
        }
        return mergeIntervals.toArray(new int[mergeIntervals.size()][]);
        
    }
    
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] merged = merge(intervals);

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }    
}
