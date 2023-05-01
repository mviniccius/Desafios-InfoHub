
public class Sudoku {
	
	public static void solveSudoku(int[][] board) {        

        if (solve(board)) {
            printBoard(board);
        } else {
            System.out.println("Não foi possível encontrar uma solução para o Sudoku.");
        }
    }

    private static boolean solve(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) { // célula vazia
                    for (int num = 1; num <= 9; num++) { // tenta preencher com os números de 1 a 9
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num; // preenche a célula com um número válido

                            if (solve(board)) { // tenta resolver o restante do tabuleiro recursivamente
                                return true; // se a solução for encontrada, retorna true
                            }

                            board[row][col] = 0; // se a solução não for encontrada, remove o número preenchido
                        }
                    }

                    return false; // se não houver nenhum número válido para preencher a célula, retorna false
                }
            }
        }

        return true; // o tabuleiro está preenchido e válido, retorna true
    }

    private static boolean isValid(int[][] board, int row, int col, int num) {
        // verifica se o número já existe na linha
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // verifica se o número já existe na coluna
        for (int j = 0; j < 9; j++) {
            if (board[j][col] == num) {
                return false;
            }
        }

        // verifica se o número já existe no bloco 3x3
        int blockRow = row / 3 * 3;
        int blockCol = col / 3 * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[blockRow + i][blockCol + j] == num) {
                    return false;
                }
            }
        }

        return true; // o número é válido para preencher a célula
    }

    private static void printBoard(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

}
