class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int r=m.length;
        int c=m[0].length;
        int l=0;
        int h=r*c-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int ri=mid/c;
            int cj=mid%c;
            if(m[ri][cj]==t){
                return true;
            }
            if(m[ri][cj]<t){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return false;
    }
}