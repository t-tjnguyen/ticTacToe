package ticTacToe;

import java.util.Scanner;

public class PlayGame
	{
		public static void main(String[] args)
			{
				System.out.println("Let's play ticTacToe!");

				Board.displayBoard();

				System.out.println("Where would you like to put your first piece?");

				for (int i = 0; i < 5; i++)
					{
						PlayGame.makeATurnForX();
						
						PlayGame.makeATurnForO();
					}
			}
		
		public static void placeX()
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

		public static void placeO()
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

		public static void makeATurnForX()
		{
			System.out.println("x's turn!");
			PlayGame.placeX();
			Board.displayBoard();
			PlayGame.determineIfWin();
		}
		
		public static void makeATurnForO()
		{
			System.out.println("o's turn!");
			PlayGame.placeO();
			Board.displayBoard();
			PlayGame.determineIfWin();
			
		}
		
		public static void determineIfWin()
			{
				if (((Board.board[0][1] == "x" && Board.board[2][1] == "x" && Board.board[4][1] == "x")
						|| (Board.board[0][5].equals("x") && Board.board[2][5].equals("x") && Board.board[4][5].equals("x"))
						|| (Board.board[0][9].equals("x") && Board.board[2][9].equals("x") && Board.board[4][9].equals("x"))
						|| (Board.board[0][1].equals("x") && Board.board[0][5].equals("x") && Board.board[0][9].equals("x"))
						|| (Board.board[2][1].equals("x") && Board.board[2][5].equals("x") && Board.board[2][9].equals("x"))
						|| (Board.board[4][1].equals("x") && Board.board[4][5].equals("x") && Board.board[4][9].equals("x"))
						|| (Board.board[0][1].equals("x") && Board.board[2][5].equals("x") && Board.board[4][9].equals("x"))
						|| (Board.board[0][9].equals("x") && Board.board[2][5].equals("x") && Board.board[4][1].equals("x"))) 
						|| (Board.board[0][1] == "o" && Board.board[2][1] == "o" && Board.board[4][1] == "o")
						|| (Board.board[0][5].equals("o") && Board.board[2][5].equals("o") && Board.board[4][5].equals("o"))
						|| (Board.board[0][9].equals("o") && Board.board[2][9].equals("o") && Board.board[4][9].equals("o"))
						|| (Board.board[0][1].equals("o") && Board.board[0][5].equals("o") && Board.board[0][9].equals("o"))
						|| (Board.board[2][1].equals("o") && Board.board[2][5].equals("o") && Board.board[2][9].equals("o"))
						|| (Board.board[4][1].equals("o") && Board.board[4][5].equals("o") && Board.board[4][9].equals("o"))
						|| (Board.board[0][1].equals("o") && Board.board[2][5].equals("o") && Board.board[4][9].equals("o"))
						|| (Board.board[0][9].equals("o") && Board.board[2][5].equals("o") && Board.board[4][1].equals("o")))
					{
						System.out.println("You won!");
						System.exit(0);
					}
			}

	}
