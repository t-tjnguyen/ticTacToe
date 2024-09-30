package ticTacToe;

public class Board
	{
		public static void main(String[] args)
			{
				String[][] board =
				// [6][11]	
					{
							{ " ", "x", " ", "|", " ", "o", " ", "|", " ", "x", " " },
							{ "_", "_", "_", "|", "_", "_", "_", "|", "_", "_", "_" },
							{ " ", "x", " ", "|", " ", "o", " ", "|", " ", "x", " " },
							{ "_", "_", "_", "|", "_", "_", "_", "|", "_", "_", "_" },
							{ " ", "x", " ", "|", " ", "o", " ", "|", " ", "x", " " },
							{ " ", " ", " ", "|", " ", " ", " ", "|", " ", " ", " " } };

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