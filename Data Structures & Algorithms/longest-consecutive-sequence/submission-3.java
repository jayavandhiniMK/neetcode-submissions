class Solution {
    public int longestConsecutive(int[] nums) {
        int mc=0;
        Set<Integer> s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        for(int i:nums){
            if(!s.contains(i-1)){
                int cn=i;
                int c=1;
                while(s.contains(cn+1)){
                    c++;
                    cn++;
                }
                mc=Math.max(c,mc);
            }
        }
        return mc;
    }
}
