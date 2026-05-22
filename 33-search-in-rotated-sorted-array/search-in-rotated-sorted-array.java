class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) return mid;

            // Left half is sorted
            if (nums[l] <= nums[mid]) {
                if (nums[l] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return -1;
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         int pivot = peakIndexInMountainArray(arr);
//         int first = ();
//         if(first != -1) return first;

//         return 

//     }

//     private int peakIndexInMountainArray(MountainArray arr) {
//         int start = 0;
//         int end = arr.length() - 1;

//         while (start < end) {
//             int mid = start + (end - start) / 2;

//             if (arr.get(mid) > arr.get(mid + 1)) {
//                 end = mid;      // peak is at mid or to the left
//             } else {
//                 start = mid + 1; // peak is to the right
//             }
//         }
//         return start;
//     }
// }