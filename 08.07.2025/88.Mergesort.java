public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start filling from the back
        int i = m - 1;      // Pointer for nums1's last valid element
        int j = n - 1;      // Pointer for nums2's last element
        int k = m + n - 1;  // Pointer for placement in nums1

        while (i >= 0 && j >= 0) {
            // Place the larger of nums1[i] or nums2[j] at position k
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // Copy any remaining elements from nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
