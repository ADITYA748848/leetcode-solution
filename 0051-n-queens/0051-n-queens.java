class Solution {
    private boolean isSafe(char[][] board, int row, int col){
        int n = board.length;
        // check row -> east to west

        for(int j =0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }
        // check col -> north to south
        for(int i =0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }
        //check North east diagonal
        int i = row; 
        int j = col;
        while(i >=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        //check south east diagonal
        i = row; 
        j = col;
        while(i <n && j<n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
         //check south west diagonal
        i = row; 
        j = col;
        while(i <n && j >= 0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }
         //check north west diagonal
        i = row; 
        j = col;
        while(i >= 0 && j >=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        return true;

    }
    
    private void nQueen(char[][] board,List<List<String>> result,int row ){
        int n = board.length;

        if(row == n){
            List<String> l  = new ArrayList<>();
            for(int i = 0; i< n; i++){
                String str = "";
                for(int j= 0; j< n; j++){
                    str += board[i][j];
                }
                l.add(str);
            }
            result.add(l);
            return;
            
        }
        for(int j = 0; j<n; j++){
            if(isSafe(board,  row, j)){
                board[row][j] = 'Q';
                nQueen(board, result, row + 1  );
                board[row][j] = '.';
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                board[i][j] = '.';

            }
        }
        List<List<String>> result = new ArrayList<>();
       

        nQueen(board,result, 0 );
        return result;

        
    }
}