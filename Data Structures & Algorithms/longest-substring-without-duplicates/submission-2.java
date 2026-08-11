class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int len=0,max=-1;
        int l=0,r=0;
        Set<Character> sc=new HashSet<>();
        while(r<s.length()){
            while(sc.contains(s.charAt(r))){
                sc.remove(s.charAt(l));
                l++;
            }
            sc.add(s.charAt(r));
            len=r-l+1;
            max=Math.max(len,max);
            r++;
        }
        return max;
    }
}
