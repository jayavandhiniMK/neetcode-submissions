class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len = s1.length();

        if (len > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        for (char c : s1.toCharArray()) {
            need[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            window[s2.charAt(right) - 'a']++;
            if (right - left + 1 > len) {
                window[s2.charAt(left) - 'a']--;
                left++;
            }
            if (right - left + 1 == len &&
                Arrays.equals(need, window)) {
                return true;
            }
        }

        return false;
    }
}