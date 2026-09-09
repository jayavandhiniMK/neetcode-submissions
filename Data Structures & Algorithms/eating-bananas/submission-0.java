class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = -1;
        int mid = 1;
        for (int i : piles) {
            r = Math.max(i, r);
        }
        while (l < r) {
            mid = l + (r - l) / 2;
            int c = 0;
            for (int i : piles) {
                c = c + ((i+mid-1)/mid);
            }
            if (c <= h) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return r;
    }
}
