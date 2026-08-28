class Solution {
    public void rotate(int[][] m) {
        int n=m.length;
        for(int i=0;i<(n/2);i++){
            for(int j=0;j<n;j++){
                int t=m[i][j];
                m[i][j]=m[n-i-1][j];
                m[n-i-1][j]=t;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=t;
            }
        }
    }
}
