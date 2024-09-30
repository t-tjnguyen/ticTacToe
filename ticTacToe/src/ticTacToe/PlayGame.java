package ticTacToe;

import java.util.Scanner;

public class PlayGame
	{
		public static void main(String[] args)
			{
				Scanner scanner = new Scanner(System.in);
				System.out.println("Let's play checkers!");
				String[][] board =
						// [6][11]
						{
								{ " ", "1", " ", "|", " ", "2", " ", "|", " ", "3", " " },
								{ "_", "_", "_", "|", "_", "_", "_", "|", "_", "_", "_" },
								{ " ", "4", " ", "|", " ", "5", " ", "|", " ", "6", " " },
								{ "_", "_", "_", "|", "_", "_", "_", "|", "_", "_", "_" },
								{ " ", "7", " ", "|", " ", "8", " ", "|", " ", "9", " " },
								{ " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " " } };

				for (int row = 0; row < board.length; row++)
					{
						for (int col = 0; col < board[0].length; col++)
							{
								System.out.print(board[row][col]);
							}
						System.out.println();
					}
				System.out.println("Where would you like to put your first piece?");
				int piecePlacement = scanner.nextInt();
				if (piecePlacement == 1)
					{
						board[0][1] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement == 2)
					{
						board[0][5] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
			}
	}
