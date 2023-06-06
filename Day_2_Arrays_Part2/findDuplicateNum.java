package Day_2_Arrays_Part2;

public class findDuplicateNum {
    //aka Floyd's tortoise and hare algorithm
    //aka cycle detection algorithm

    public static int findDuplicate(int[] nums) {
        
        //initialize pointers
        int slow = nums[0];
        int fast = nums[0];

        //move pointers until the meet inside cycle
        do{
        slow = nums[slow]; //one step at a time
        fast = nums[nums[fast]];  //two step at a time
        }while(slow != fast);

        //reset slow pointer
        slow =nums[0];

        //move both pointers in same speed till they meet at entrance
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;

    }
    
    public static void main(String[] args) {
        int[] nums = { 3, 1, 3, 4, 2 }; // Example input array

        int repeatedNumber = findDuplicate(nums);

        System.out.println("Repeated number: " + repeatedNumber);
    }
}
