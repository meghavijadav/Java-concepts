public class nQueensInNRows {
    public static void nQueens(char[][] board, int row) {
        for (int j = 0; j < board.length; j++) {
            //base case
            if(row == board.length){
                printBoard(board);
                return;
            }

            //column loop
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'x'; //This is to check other solutions where we do not want 'Q' in the same position
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("--------chess board--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n= 3;
        char board[][] = new char[n][n];

        //initialise 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board,0);
    }
}
