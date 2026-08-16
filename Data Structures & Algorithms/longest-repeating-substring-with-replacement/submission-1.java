class Solution {
    public int characterReplacement(String s, int k){
        int f[]=new int[26];
        int l=0;
        int ml=0;
        int mf=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            f[c-'A']++;
            mf=Math.max(f[c-'A'],mf);
            if(r-l+1-mf>k){
                char cl=s.charAt(l);
                f[cl-'A']--;
                l++;
            }
            ml=Math.max(ml,r-l+1);
        }
        return ml;
    }
}
 