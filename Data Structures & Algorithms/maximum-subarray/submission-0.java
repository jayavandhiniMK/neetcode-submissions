class Solution {
    public int maxSubArray(int[] nums) {
        int m=nums[0];
        int cs=nums[0];
        for(int i=1;i<nums.length;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            m=Math.max(m,cs);
        }
        return m;
    }
}
