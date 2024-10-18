package ticTacToe;

import java.util.Scanner;

public class PlayGame
	{
		public static void main(String[] args)
			{
				System.out.println("Let's play ticTacToe! (Sorry, you'll really be playing by yourself)");

				Board.displayBoard();

				System.out.println("Where would you like to put your first piece?");

				
				for (int i = 0; i < 9; i++)
					{
						PlayGame.placex();
						Board.displayBoard();
						System.out.println("o's turn!");
						PlayGame.placeo();
						Board.displayBoard();
						System.out.println("x's turn!");
						PlayGame.determineIfWin();
					}

			}
//				PlayGame.replaceNumberx();
//				Board.displayBoard();
//				System.out.println("Where would you like to put your second piece?");
//				PlayGame.replaceNumbero();
//				Board.displayBoard();
//				System.out.println("Where would you like to put your third piece?");
//				
//				PlayGame.replaceNumberx();
//				Board.displayBoard();
//				System.out.println("Where would you like to put your fourth piece?");
//				PlayGame.replaceNumbero();
//				Board.displayBoard();

		public static void placex()
			{
				Scanner scanner = new Scanner(System.in);
				int piecePlacement = scanner.nextInt();
				if (piecePlacement == 1)
					{
						Board.board[0][1] = "x";
					}
				else if (piecePlacement == 2)
					{
						Board.board[0][5] = "x";
					}
				else if (piecePlacement == 3)
					{
						Board.board[0][9] = "x";
					}
				else if (piecePlacement == 4)
					{
						Board.board[2][1] = "x";
					}
				else if (piecePlacement == 5)
					{
						Board.board[2][5] = "x";
					}
				else if (piecePlacement == 6)
					{
						Board.board[2][9] = "x";
					}
				else if (piecePlacement == 7)
					{
						Board.board[4][1] = "x";
					}
				else if (piecePlacement == 8)
					{
						Board.board[4][5] = "x";
					}
				else if (piecePlacement == 9)
					{
						Board.board[4][9] = "x";
					}
			}

		public static void placeo()
			{
				Scanner scanner = new Scanner(System.in);
				int piecePlacement = scanner.nextInt();
				if (piecePlacement == 1)
					{
						Board.board[0][1] = "o";
					}
				else if (piecePlacement == 2)
					{
						Board.board[0][5] = "o";
					}
				else if (piecePlacement == 3)
					{
						Board.board[0][9] = "o";
					}
				else if (piecePlacement == 4)
					{
						Board.board[2][1] = "o";
					}
				else if (piecePlacement == 5)
					{
						Board.board[2][5] = "o";
					}
				else if (piecePlacement == 6)
					{
						Board.board[2][9] = "o";
					}
				else if (piecePlacement == 7)
					{
						Board.board[4][1] = "o";
					}
				else if (piecePlacement == 8)
					{
						Board.board[4][5] = "o";
					}
				else if (piecePlacement == 9)
					{
						Board.board[4][9] = "o";
					}
			}

		public static void determineIfWin()
			{
				boolean win = false;
				if ((Board.board[0][1] == "x" && Board.board[2][1] == "x" && Board.board[4][1] == "x")
						|| (Board.board[0][5].equals("x") && Board.board[2][5].equals("x") && Board.board[4][5].equals("x"))
						|| (Board.board[0][9].equals("x") && Board.board[2][9].equals("x") && Board.board[4][9].equals("x"))
						|| (Board.board[0][1].equals("x") && Board.board[0][5].equals("x") && Board.board[0][9].equals("x"))
						|| (Board.board[2][1].equals("x") && Board.board[2][5].equals("x") && Board.board[2][9].equals("x"))
						|| (Board.board[4][1].equals("x") && Board.board[4][5].equals("x") && Board.board[4][9].equals("x"))
						|| (Board.board[0][1].equals("x") && Board.board[2][5].equals("x") && Board.board[4][9].equals("x"))
						|| (Board.board[0][9].equals("x") && Board.board[2][5].equals("x") && Board.board[4][1].equals("x")))
					{
						System.out.println("You won!");
						win = true;
					}
//				else
//					{
//						System.out.println("It's a tie!");
//					}
			}

		public static void gainInput()
			{
				System.out.println("Where would you like to put your first piece?");
				Scanner scanner = new Scanner(System.in);
				int piecePlacement = scanner.nextInt();
			}
	}
