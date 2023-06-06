public class sortColors {
   
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        int pivot = 1; // Pivot value for sorting (in this case, it's 1)

        while (mid <= high) {
            if (nums[mid] < pivot) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] > pivot) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 0, 2, 1, 0 };
        sortColors(nums);

        System.out.println("Sorted Colors:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
