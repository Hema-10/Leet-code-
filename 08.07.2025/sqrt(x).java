public class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // To prevent overflow, use long for multiplication
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square < x) {
                result = mid; // keep track of nearest lower sqrt
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
