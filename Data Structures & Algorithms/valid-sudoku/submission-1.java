class Solution {
    public boolean isValidSudoku(char[][] b) {
        int r=b.length;
        int c=b[0].length;
        for (int i = 0; i < r; i++) {
            Set<Character> s = new HashSet<>();

            for (int j = 0; j < c; j++) {
                if (b[i][j] == '.') continue;

                if (s.contains(b[i][j])) {
                    return false;
                }

                s.add(b[i][j]);
            }
        }
        for (int j = 0; j < c; j++) {
            Set<Character> s = new HashSet<>();

            for (int i = 0; i < r; i++) {
                if (b[i][j] == '.') continue;

                if (s.contains(b[i][j])) {
                    return false;
                }

                s.add(b[i][j]);
            }
        }
        for(int i=0;i<r;i+=3){
            for(int j=0;j<c;j+=3){
                Set<Character> s=new HashSet<>();
                for(int k=i;k<i+3;k++){                 
                    for(int l=j;l<j+3;l++){
                        if(b[k][l]=='.') continue;
                        if(s.contains(b[k][l])) return false;
                        s.add(b[k][l]);
                    }
                }
            }
        }
        return  true;
    }
}
