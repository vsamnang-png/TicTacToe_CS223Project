public class GameModel { // Define a public class named GameModel

    // 2D array to represent the 3x3 Tic-Tac-Toe board
    // Each cell will store "X", "O", or null (if empty)
    private String[][] board;

    // Variable to keep track of the current player ("X" or "O")
    private String currentPlayer;
    public int score;

    // Constructor - runs when a new GameModel object is created
    public GameModel() {
        // Initialize the board as a 3x3 grid
        board = new String[5][5];
        // Set the starting player to "X"
        currentPlayer = "\uD83D\uDE00";
    }

    // Method to return the current player
    public String getCurrentPlayer() {
        return currentPlayer;
    }

    // Method to place a mark on the board at given row and column
    public boolean placeMark(int row, int col) {
        // If the selected cell is already filled, move is invalid
        if (board[row][col] != null) {
            return false;
        }
        // Place the current player's mark in the selected cell
        board[row][col] = currentPlayer;
        // Return true because move was successful
        return true;
    }

    // Method to switch turns between players
    public void switchTurn() {

        // If current player is "X", change to "O"
        // Otherwise change to "X"
        currentPlayer = currentPlayer.equals("\uD83D\uDE00") ? "\uD83D\uDE14" : "\uD83D\uDE00";
    }

    // Method to check if a specific player has won
    public boolean checkWin(String player) {

        // Check all rows
        for (int r = 0; r < 3; r++) {
            // If all 3 cells in a row match the player, they win
            if (player.equals(board[r][0]) &&
                    player.equals(board[r][1]) &&
                    player.equals(board[r][2])) {
                return true; // Player wins
            }
        }

        // Check all columns
        for (int c = 0; c < 3; c++) {
            // If all 3 cells in a column match the player, they win
            if (player.equals(board[0][c]) &&
                    player.equals(board[1][c]) &&
                    player.equals(board[2][c])) {
                return true; // Player wins
            }
        }


        if (player.equals(board[0][0]) &&
                player.equals(board[1][1]) &&
                player.equals(board[2][2])) {
            return true; // Player wins
        }

        if (player.equals(board[0][2]) &&
                player.equals(board[1][1]) &&
                player.equals(board[2][0])) {
            return true; // Player wins
        }

        // If no winning condition is met, return false
        return false;
    }

    // Method to reset the game
    public void reset() {
        // Create a new empty 3x3 board
        board = new String[5][5];
        // Reset starting player back to "X"
        currentPlayer = "\uD83D\uDE00";
    }

    // Method to check if the game is a draw
    public boolean isDraw() {
        // Loop through all rows
        for (int r = 0; r < 5; r++) {
            // Loop through all columns
            for (int c = 0; c < 5; c++) {
                // If any cell is still empty, it's NOT a draw
                if (board[r][c] == null) {
                    return false;
                }
            }
        }
        // If all cells are filled and no winner, it's a draw
        return true;
    }
}
