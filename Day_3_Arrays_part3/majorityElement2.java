package Day_3_Arrays_part3;

import java.util.*;

public class majorityElement2 {

    public List<Integer> majorityElement(int[] nums){
        int n = nums.length;
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i,hm.getOrDefault(i, 0)+1);
        }

        List<Integer> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue()>n){
                result.add(entry.getValue());
            }
        }
        return result;
    }
    
}
