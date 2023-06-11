package Day_3_Arrays_part3;

public class majorityElement1 {
    public int majorityElement(int[] nums){
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0;j<n;j++){
                if(nums[j]==nums[i])
                    count++;
            }
            if(count>n/2)
                return nums[i];

        }
        return -1;
    }
}
