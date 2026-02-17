class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
       return  magneticForce(arr,m);
        
    }

    public static int magneticForce(int arr[], int m) {

        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isPossible(arr, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int arr[], int m, int mid) {

        int count = 1;
        int lastPosition = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - lastPosition >= mid) {
                count++;
                lastPosition = arr[i];
            }

            if (count == m) {
                return true;
            }
        }
        return false;
    }
}

