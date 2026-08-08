
class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;

        ArrayList<Integer> l1 = new ArrayList<>(); // positive
        ArrayList<Integer> l2 = new ArrayList<>(); // negative

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {

            if (nums[i] >= 0) {
                l1.add(nums[i]);
            } else {
                l2.add(nums[i]);
            }
        }

        // Square positive numbers
        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i) * l1.get(i));
        }

        // Square negative numbers
        for (int i = 0; i < l2.size(); i++) {
            l2.set(i, l2.get(i) * l2.get(i));
        }

        // Reverse negative squares
        Collections.reverse(l2);

        // Convert ArrayLists into arrays
        int[] a = new int[l1.size()];
        int[] b = new int[l2.size()];

        for (int i = 0; i < l1.size(); i++) {
            a[i] = l1.get(i);
        }

        for (int i = 0; i < l2.size(); i++) {
            b[i] = l2.get(i);
        }

        // Merge two sorted arrays
        int i = 0;
        int j = 0;

        int m = a.length;
        int k = b.length;

        int[] res = new int[m + k];

        int idx = 0;

        while (i < m && j < k) {

            if (a[i] <= b[j]) {
                res[idx] = a[i];
                i++;
            } else {
                res[idx] = b[j];
                j++;
            }

            idx++;
        }

        // Remaining elements of a
        while (i < m) {
            res[idx] = a[i];
            i++;
            idx++;
        }

        // Remaining elements of b
        while (j < k) {
            res[idx] = b[j];
            j++;
            idx++;
        }

        return res;
    }
}