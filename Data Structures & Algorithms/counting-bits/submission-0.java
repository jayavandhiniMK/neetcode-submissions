class Solution {
    public int[] countBits(int nu) {
        int a[]=new int[nu+1];
        for(int i=0;i<=nu;i++){
            int n=i;
            int c=0;
            while(n>0){
                if((n&1)==1) c++;
                n=n>>1; 
            }
            a[i]=c;
        }
        return a;
    }
}
