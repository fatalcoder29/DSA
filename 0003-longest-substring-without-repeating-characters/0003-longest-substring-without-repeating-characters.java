class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0, max_length = 0;
        Set<Character> set = new HashSet<>();

        while (end < n) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max_length;
    }
}