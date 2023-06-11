package Day_3_Arrays_part3;

public class reversePair{
        public int reversePairs(int[] nums) {
            return mergeSort(nums, 0, nums.length - 1);
        }

        private int mergeSort(int[] nums, int left, int right) {
            if (left >= right) {
                return 0;
            }

            int mid = (left + right) / 2;
            int count = mergeSort(nums, left, mid) + mergeSort(nums, mid + 1, right);

            // Counting reverse pairs
            int i = left;
            int j = mid + 1;
            while (i <= mid && j <= right) {
                if ((long) nums[i] > 2 * (long) nums[j]) {
                    count += mid - i + 1; // Count reverse pairs
                    j++;
                } else {
                    i++;
                }
            }

            // Merge two sorted arrays
            merge(nums, left, mid, right);
            return count;
        }

        private void merge(int[] nums, int left, int mid, int right) {
            int[] temp = new int[right - left + 1];
            int i = left;
            int j = mid + 1;
            int k = 0;

            while (i <= mid && j <= right) {
                if (nums[i] <= nums[j]) {
                    temp[k++] = nums[i++];
                } else {
                    temp[k++] = nums[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = nums[i++];
            }

            while (j <= right) {
                temp[k++] = nums[j++];
            }

            System.arraycopy(temp, 0, nums, left, temp.length);
        }

    }
