package ticTacToe;

public class Board
	{
		static String[][] board =
		// [6][11]

				  { { " ", "1", " ", "|", " ", "2", " ", "|", " ", "3", " " },
					{ "_", "_", "_", "|", "_", "_", "_", "|", "_", "_", "_" },
					{ " ", "4", " ", "|", " ", "5", " ", "|", " ", "6", " " },
					{ "_", "_", "_", "|", "_", "_", "_", "|", "_", "_", "_" },
					{ " ", "7", " ", "|", " ", "8", " ", "|", " ", "9", " " },
					{ " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " " } };

		public static void displayBoard()
			{
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
// i successfully import/committed from home