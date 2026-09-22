class Solution {
    public boolean isValidSudoku(char[][] b) {
        for (int i = 0; i < 9; i++) {
            Set<Character> s = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (b[i][j] == '.') continue;

                if (s.contains(b[i][j])) {
                    return false;
                }

                s.add(b[i][j]);
            }
        }
        for (int j = 0; j < 9; j++) {
            Set<Character> s = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (b[i][j] == '.') continue;

                if (s.contains(b[i][j])) {
                    return false;
                }

                s.add(b[i][j]);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
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
