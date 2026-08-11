class Solution {
    public int maxProfit(int[] p) {
        int l=0,r=1;
        int max=0;
        while(r<p.length){
            if(p[l]<p[r]){
                int pr=p[r]-p[l];
                max=Math.max(max,pr);
            }else{
                l=r;
            }
            r++;
        }
        return max;
    }
}
