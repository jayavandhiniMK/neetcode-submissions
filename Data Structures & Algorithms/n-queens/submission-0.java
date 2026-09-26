class Solution {
    List<List<String>> res;
    public List<List<String>> solveNQueens(int n) {
        res=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(0,board,n);
        return res;
    }

    public void solve(int row,char[][] board,int n){
        if(row==n){
            List<String> sol=new ArrayList<>();
            for(char[] c:board){
                sol.add(new String(c));
            }
            res.add(sol);
            return;
        }
        for(int i=0;i<n;i++){
            if(safe(row,i,n,board)){
                board[row][i]='Q';
                solve(row+1,board,n);
                board[row][i]='.';
            }
        }
    }

    public Boolean safe(int row,int col,int n,char[][] board){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}