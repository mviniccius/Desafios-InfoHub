
public class Main {	
	
	public static void printBoard(int[][] sudoku) {
	    for (int linha = 0; linha < sudoku.length; linha++) {
	        for (int coluna = 0; coluna < sudoku[linha].length; coluna++) {
	            System.out.print(sudoku[linha][coluna] + " ");
	        }
	        System.out.println();
	    }
	}

	public static void imprime() {
		System.out.println("__________________________________________________________________________");
	}
	
	

	public static void main(String[] args) {
		
		int menu;
		
		
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("----                              SUDOKU                                              ----");
		System.out.println("------------------------------------------------------------------------------------------");
				
		int[][] boardEasy1 = {
	            {8, 3, 9, 7, 0, 5, 0, 1, 6},
	            {0, 7, 0, 3, 1, 2, 5, 8 ,9},
	            {5, 2, 1, 0, 8, 9, 0, 3, 0},
	            {0, 8, 6, 0, 0, 7, 1, 2, 0},
	            {2, 1, 0, 0, 5, 6, 4, 7, 8},
	            {0, 0, 0, 1, 0, 0, 9, 6, 3},
	            {1, 5, 8, 2, 9, 3, 6, 0, 7},
	            {3, 6, 0, 5, 7, 4, 8, 9, 0},
	            {4, 0, 0, 0, 6, 1, 3, 5, 2}
	        };
		
		int[][] boardEasy2 = {
				{0, 9, 0, 1, 2, 0, 4, 6, 5},
				{0, 0, 0, 8, 5, 6, 9, 0, 3},
				{0, 1, 0, 0, 9, 4, 0, 0, 8},
				{0, 3, 0, 7, 0, 8, 0, 0, 6},
				{1, 0, 0, 0, 0, 2, 0, 3, 0},
				{8, 0, 0, 9, 3, 5, 1, 2, 0},
				{7, 0, 0, 0, 6, 0, 3, 0, 2},
				{6, 5, 1, 2, 8, 0, 0, 9, 4},
				{2, 4, 3, 0, 7, 9, 0, 0, 0}
				
		};		
		
		int[][] boardMedium = {
				{0, 4, 6, 1, 0, 9, 2, 0, 0},
				{0, 0, 2, 0, 6, 4, 0, 0, 0},
				{0, 0, 1, 3, 5, 2, 8, 0, 0},
				{0, 0, 8, 0, 0, 0, 0, 4, 2},
				{0, 0, 3, 8, 0, 0, 5, 7, 9},
				{0, 6, 9, 0, 0, 0, 0, 0, 0},
				{6, 0, 7, 9, 8, 0, 0, 0, 0},
				{0, 0, 0, 0, 1, 3, 0, 0, 0},
				{9, 1, 0, 4, 0, 0, 0, 0, 6}
		};
		
		int[][] boardHard = {
				{0, 5, 3, 0, 0, 0, 4, 0, 0},
				{1, 0, 0, 0, 5, 6, 0, 0, 0},
				{0, 0, 0, 0, 1, 0, 0, 5, 0},
				{0, 0, 8, 0, 0, 5, 6, 0, 3},
				{2, 0, 0, 4, 0, 0, 0, 9, 8},
				{6, 7, 0, 0, 0, 0, 0, 0, 0},
				{0, 0, 7, 0, 0, 0, 0, 0, 9},
				{0, 2, 6, 8, 4, 0, 0, 3, 1},
				{0, 0, 0, 0, 0, 0, 0, 6, 0}
		};
		
		int[][] boardExtreme = {
				{4, 0, 0, 0, 0, 0, 0, 1, 0},
				{0, 0, 0, 4, 0, 2, 3, 0, 0},
				{8, 3, 6, 0, 1, 0, 0, 0, 0},
				{2, 0, 0, 0, 6, 0, 0, 5, 7},
				{0, 9, 0, 5, 0, 0, 6, 0, 1},
				{0, 0, 7, 1, 0, 0, 0, 0, 0},
				{0, 0, 0, 0, 8, 6, 0, 0, 3},
				{7, 0, 0, 0, 0, 0, 0, 0, 0},
				{6, 4, 0, 0, 7, 0, 0, 0, 2}
		};
		
		do {
			
			System.out.println("0 - Sair");
			System.out.println("1 - Imprimir primeiro caso: EASY");
			System.out.println("2 - Imprimir segundo caso: EASY");
			System.out.println("3 - Imprimir terceiro caso : MEDIUM");
			System.out.println("4 - Imprimir quarto caso: HARD");
			System.out.println("5 - Imrpimir quinto caso: EXTREME");			
			menu = MyIO.readInt("Digite o opcao desejada ou 0(zero) para sair:");
			
			
			switch(menu) {
			case 0:
				break;			
				
				case 1:
					printBoard(boardEasy1);
					imprime();
					System.out.println("O jogo resolvido:");
					imprime();
					Sudoku.solveSudoku(boardEasy1);					
				break;
				
				case 2:
					printBoard(boardEasy2);
					imprime();
					Sudoku.solveSudoku(boardEasy2);
					imprime();
				break;
				
				case 3:
					printBoard(boardMedium);
					imprime();
					Sudoku.solveSudoku(boardMedium);
					imprime();
				break;
				
				case 4:
					printBoard(boardHard);
					imprime();
					Sudoku.solveSudoku(boardHard);
					imprime();
				break;
				
				case 5:
					printBoard(boardExtreme);
					imprime();
					Sudoku.solveSudoku(boardExtreme);
					imprime();
				break;				
				
				default:
					System.out.println("Opcao invalida");
			}
			
		}while(menu != 0);
		
		System.out.println("saiu!");			

	}

}
