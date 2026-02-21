class Solution {
    public int shipWithinDays(int[] arr, int k) {

        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (isItPossible(arr, k, mid)) {
                ans = mid;       // store the feasible answer
                high = mid - 1;  // try to minimize
            } else {
                low = mid + 1;   // increase limit
            }
        }
        return ans;
    }

    public boolean isItPossible(int[] arr, int k, int mid) {
        int day= 1;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= mid) {
                sum += arr[i];
            } else {
                day++;
                sum = arr[i];
            }
            if (day > k) {
                return false;
            }
        }
        return true;
    }
}