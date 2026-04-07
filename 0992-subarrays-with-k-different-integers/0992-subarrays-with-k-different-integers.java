  class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums, k) - helper(nums, k - 1);
    }

    private int helper(int[] nums, int k) {
        int left = 0, count = 0, result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {

            // add element
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // new distinct element
            if (map.get(nums[right]) == 1) {
                count++;
            }

            // shrink window
            while (count > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    count--;
                }

                left++;
            }

            // count subarrays
            result += (right - left + 1);
        }

        return result;
    }
}