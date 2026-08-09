
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        int n = nums.length;

        List<List<Integer>> l1 = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // 2Sum target
            int target = -nums[i];

            int j = i + 1;
            int k = n - 1;

            // 2Sum using two pointers
            while (j < k) {

                int sum = nums[j] + nums[k];

                if (sum == target) {

                    l1.add(Arrays.asList(
                        nums[i],
                        nums[j],
                        nums[k]
                    ));

                    j++;
                    k--;

                    // Skip duplicates
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }

                else if (sum < target) {
                    j++;
                }

                else {
                    k--;
                }
            }
        }

        return l1;
    }
}