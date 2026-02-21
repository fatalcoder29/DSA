class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        // Edge case: not enough flowers at all
        if ((long) m * k > bloomDay.length) return -1;

        int low = Arrays.stream(bloomDay).min().getAsInt();
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] bloomDay, int m, int k, int mid) {
        int count = 0;   // consecutive bloomed flowers
        int total = 0;   // bouquets formed

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                count++;          // flower has bloomed ✅
            } else {
                count = 0;        // not bloomed, reset streak ❌
            }

            if (count == k) {
                total++;          // one bouquet formed 🌸
                count = 0;        // reset for next bouquet
            }

            if (total == m) return true;  // found enough bouquets!
        }
        return false;
    }
}