package Lab;
import java.util.Scanner;

public class Lab10 {
	 private static void displayBoard(char[][] board) {
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[i].length; j++) {
	                if (j == board[i].length - 1) System.out.print(board[i][j]);
	                else System.out.print( board[i][j] + " | ");
	            }
	            System.out.println();
	        }


	    }
	public enum Player{
		X,O
	};
	public static char[][] TicTacToe(){
		char [][] board ={{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
		
		return board;
	}
		public static void main(String[] args){
			char temp;
			char [][] board = TicTacToe();
			Player turn = Player.X;
			Scanner input = new Scanner(System.in);
			boolean GameOver = false;
			while (GameOver == false) {
			
				for (int counter = 0; counter < 9; counter++) { //total of 10 inputs for tic tac toe
					System.out.println("Player " + turn + "\'s turn"); //stating whose turn it is
					System.out.println("Please enter your desired row(0-2)");
					int row = input.nextInt();
					while (row > 3 || row < 0 ) {
					row = input.nextInt();
					}
					System.out.println("Please enter your desired column(0-2)");
					int column = input.nextInt();
					while (column > 3 || column < 0 ) {
					column = input.nextInt();
					}
					if(board[row][column] == ' ') {
						if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					board[row][column] = temp;
				}
				else {
					System.out.println("The space is already occupied. Try Again!");
				}
				if(board[0][0]== 'X' || board[0][0]=='O') {
				if (board[0][0] == board [0][1] && board[0][0] == board [0][2]) {
					
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won" + " with coordinates [0][0], [0][1], & [0][2]");
					System.exit(0);
				}
				
				if (board[0][0] == board [1][1] && board[0][0] == board [2][2]) {
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won"+ " with coordinates [0][0], [1][1], & [2][2]");
					System.exit(0);
				}
				if (board[0][0] == board [1][0] && board[0][0] == board [2][0]) {
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won"+ " with coordinates [0][0], [1][0], & [2][0]");
					System.exit(0);
				}
				}
				if(board[2][0]== 'X' || board[2][0]=='O') {
				if (board[2][0] == board [2][1] && board[2][0] == board [2][2]) {
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won"+ " with coordinates [2][0], [2][1], & [2][2]");
					System.exit(0);
				}
				if (board[2][0] == board [1][1] && board[0][0] == board [0][2]) {
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won"+ " with coordinates [2][0], [1][1], & [0][2]");
					System.exit(0);
				}
				}
				if(board[0][2]== 'X' || board[0][2]=='O') {
				if (board[0][2] == board [1][2] && board[0][2] == board [2][2]) {
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won"+ " with coordinates [0][2], [1][2], & [2][2]");
					System.exit(0);
				}
				}
				if(board[0][1]== 'X' || board[0][1]=='O') {
				if (board[0][1] == board [1][1] && board[0][1] == board [2][1]) {
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won"+ " with coordinates [0][1], [1][1], & [2][1]");
					System.exit(0);
				}
				}
				if(board[1][0]== 'X' || board[1][0]=='O') {
				if (board[1][0] == board [1][1] && board[1][0] == board [1][2]) {
					GameOver = true;
					displayBoard(board);
					if(turn == Player.X) {
						temp = 'X';
						turn = Player.O;
						}
						else {
						temp = 'O';
						turn = Player.X;
						}
					System.out.println("Player " + turn + " has won"+ " with coordinates [1][0], [1][1], & [1][2]");
					System.exit(0);
				}
				}
				displayBoard(board);
				}
			}
			if(GameOver== true) {
				System.out.println("Game Over!");
			}
		
			
			
		}
}


