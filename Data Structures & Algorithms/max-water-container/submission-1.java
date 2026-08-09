class Solution {
    public int maxArea(int[] h) {
        int l=0,max=0;
        int r=h.length-1;
        while(l<r){
            int s1=Math.min(h[l],h[r]);
            int s2=r-l;
            max=Math.max(max,s1*s2);
            if(h[l]<h[r]) l++;
            else r--;
        }
        return max;
    }
}
