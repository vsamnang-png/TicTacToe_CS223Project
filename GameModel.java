public class GameModel {

    private String[][] board;
    private String currentPlayer;

    public GameModel() {
        board = new String[3][3];
        currentPlayer = "X";
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public boolean placeMark(int row, int col) {
        if (board[row][col] != null) {
            return false; 
        }
        board[row][col] = currentPlayer;
        return true;
    }

    public void switchTurn() {
        currentPlayer = currentPlayer.equals("X") ? "O" : "X";
    }

    public boolean checkWin(String player) {
       
        for (int r = 0; r < 3; r++) {
            if (player.equals(board[r][0]) &&
                player.equals(board[r][1]) &&
                player.equals(board[r][2])) {
                return true;
            }
        }

        
        for (int c = 0; c < 3; c++) {
            if (player.equals(board[0][c]) &&
                player.equals(board[1][c]) &&
                player.equals(board[2][c])) {
                return true;
            }
        }

    
        if (player.equals(board[0][0]) &&
            player.equals(board[1][1]) &&
            player.equals(board[2][2])) {
            return true;
        }

        if (player.equals(board[0][2]) &&
            player.equals(board[1][1]) &&
            player.equals(board[2][0])) {
            return true;
        }

        return false;
    }

    public void reset() {
        board = new String[3][3];
        currentPlayer = "X";
    }

    public boolean isDraw() {
    for (int r = 0; r < 3; r++) {
        for (int c = 0; c < 3; c++) {
            if (board[r][c] == null) {
                return false;
            }
        }
    }
    return true;
}

}
