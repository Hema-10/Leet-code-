import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> lookup = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (lookup.containsKey(complement)) {
                return new int[] {lookup.get(complement), i};
            }
            lookup.put(nums[i], i);
        }
        return null; // You could throw an exception if needed
    }
}
