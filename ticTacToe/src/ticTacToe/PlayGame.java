package ticTacToe;

import java.util.Scanner;

public class PlayGame
	{
		public static void main(String[] args)
			{
				System.out.println("Let's play ticTacToe! (Sorry, you'll really be playing by yourself)");
				
				Board.displayBoard();
				
				//PlayGame.gainInput();
				System.out.println("Where would you like to put your first piece?");
				
				for (int i = 1; i < 10; i++)
					{
						PlayGame.replaceNumberx();
						Board.displayBoard();
						System.out.println("Where would you like to put your second piece?");
						PlayGame.replaceNumbero();
						Board.displayBoard();
						System.out.println("Where would you like to put your second piece?");
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
				
				/*int piecePlacement2 = scanner.nextInt();
				if (piecePlacement2 == 1)
					{
						board[0][1] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 2)
					{
						board[0][5] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 3)
					{
						board[0][9] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 4)
					{
						board[2][1] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 5)
					{
						board[2][5] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 6)
					{
						board[2][9] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 7)
					{
						board[4][1] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 8)
					{
						board[4][5] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement2 == 9)
					{
						board[4][9] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				System.out.println("Where would you like to put your third piece?");
				int piecePlacement3 = scanner.nextInt();
				if (piecePlacement3 == 1)
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
				else if (piecePlacement3 == 2)
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
				else if (piecePlacement3 == 3)
					{
						board[0][9] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement3 == 4)
					{
						board[2][1] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement3 == 5)
					{
						board[2][5] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement3 == 6)
					{
						board[2][9] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement3 == 7)
					{
						board[4][1] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement3 == 8)
					{
						board[4][5] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement3 == 9)
					{
						board[4][9] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				System.out.println("Where would you like to put your fourth piece?");
				int piecePlacement4 = scanner.nextInt();
				if (piecePlacement4 == 1)
					{
						board[0][1] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 2)
					{
						board[0][5] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 3)
					{
						board[0][9] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 4)
					{
						board[2][1] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 5)
					{
						board[2][5] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 6)
					{
						board[2][9] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 7)
					{
						board[4][1] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 8)
					{
						board[4][5] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement4 == 9)
					{
						board[4][9] = "o";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				System.out.println("Where would you like to put your fifth piece?");
				int piecePlacement5 = scanner.nextInt();
				if (piecePlacement5 == 1)
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
				else if (piecePlacement5 == 2)
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
				else if (piecePlacement5 == 3)
					{
						board[0][9] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement5 == 4)
					{
						board[2][1] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement5 == 5)
					{
						board[2][5] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement5 == 6)
					{
						board[2][9] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement5 == 7)
					{
						board[4][1] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement5 == 8)
					{
						board[4][5] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				else if (piecePlacement5 == 9)
					{
						board[4][9] = "x";
						for (int row = 0; row < board.length; row++)
							{
								for (int col = 0; col < board[0].length; col++)
									{
										System.out.print(board[row][col]);
									}
								System.out.println();
							}
					}
				if ((board[0][1] == "x" && board[2][1] == "x" && board[4][1] == "x")
						|| (board[0][5] == "x" && board[2][5] == "x" && board[4][5] == "x")
						|| (board[0][9] == "x" && board[2][9] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[0][5] == "x" && board[0][9] == "x")
						|| (board[2][1] == "x" && board[2][5] == "x" && board[2][9] == "x")
						|| (board[4][1] == "x" && board[4][5] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[2][5] == "x" && board[4][9] == "x")
						|| (board[0][9] == "x" && board[2][5] == "x" && board[4][1] == "x"))
					{
						System.out.println("You won!");
					}
				else
					{

						System.out.println("Where would you like to put your sixth piece?");

						int piecePlacement6 = scanner.nextInt();
						if (piecePlacement6 == 1)
							{
								board[0][1] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 2)
							{
								board[0][5] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 3)
							{
								board[0][9] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 4)
							{
								board[2][1] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 5)
							{
								board[2][5] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 6)
							{
								board[2][9] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 7)
							{
								board[4][1] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 8)
							{
								board[4][5] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement6 == 9)
							{
								board[4][9] = "o";
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
				if ((board[0][1] == "x" && board[2][1] == "x" && board[4][1] == "x")
						|| (board[0][5] == "x" && board[2][5] == "x" && board[4][5] == "x")
						|| (board[0][9] == "x" && board[2][9] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[0][5] == "x" && board[0][9] == "x")
						|| (board[2][1] == "x" && board[2][5] == "x" && board[2][9] == "x")
						|| (board[4][1] == "x" && board[4][5] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[2][5] == "x" && board[4][9] == "x")
						|| (board[0][9] == "x" && board[2][5] == "x" && board[4][1] == "x"))
					{
						System.out.println("You won!");
					}
				else
					{

						System.out.println("Where would you like to put your seventh piece?");
						int piecePlacement7 = scanner.nextInt();
						if (piecePlacement7 == 1)
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
						else if (piecePlacement7 == 2)
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
						else if (piecePlacement7 == 3)
							{
								board[0][9] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement7 == 4)
							{
								board[2][1] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement7 == 5)
							{
								board[2][5] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement7 == 6)
							{
								board[2][9] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement7 == 7)
							{
								board[4][1] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement7 == 8)
							{
								board[4][5] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement7 == 9)
							{
								board[4][9] = "x";
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
				if ((board[0][1] == "x" && board[2][1] == "x" && board[4][1] == "x")
						|| (board[0][5] == "x" && board[2][5] == "x" && board[4][5] == "x")
						|| (board[0][9] == "x" && board[2][9] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[0][5] == "x" && board[0][9] == "x")
						|| (board[2][1] == "x" && board[2][5] == "x" && board[2][9] == "x")
						|| (board[4][1] == "x" && board[4][5] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[2][5] == "x" && board[4][9] == "x")
						|| (board[0][9] == "x" && board[2][5] == "x" && board[4][1] == "x"))
					{
						System.out.println("You won!");
					}
				else
					{

						System.out.println("Where would you like to put your eighth piece?");
						int piecePlacement8 = scanner.nextInt();
						if (piecePlacement8 == 1)
							{
								board[0][1] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement8 == 2)
							{
								board[0][5] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement8 == 3)
							{
								board[0][9] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}

						else if (piecePlacement8 == 4)
							{
								board[2][1] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement8 == 5)
							{
								board[2][5] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement8 == 6)
							{
								board[2][9] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement8 == 7)
							{
								board[4][1] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement8 == 8)
							{
								board[4][5] = "o";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement8 == 9)
							{
								board[4][9] = "o";
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
				if ((board[0][1] == "x" && board[2][1] == "x" && board[4][1] == "x")
						|| (board[0][5] == "x" && board[2][5] == "x" && board[4][5] == "x")
						|| (board[0][9] == "x" && board[2][9] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[0][5] == "x" && board[0][9] == "x")
						|| (board[2][1] == "x" && board[2][5] == "x" && board[2][9] == "x")
						|| (board[4][1] == "x" && board[4][5] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[2][5] == "x" && board[4][9] == "x")
						|| (board[0][9] == "x" && board[2][5] == "x" && board[4][1] == "x"))
					{
						System.out.println("You won!");
					}
				else
					{

						System.out.println("Where would you like to put your ninth piece?");
						int piecePlacement9 = scanner.nextInt();
						if (piecePlacement9 == 1)
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
						else if (piecePlacement9 == 2)
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
						else if (piecePlacement9 == 3)
							{
								board[0][9] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement9 == 4)
							{
								board[2][1] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement9 == 5)
							{
								board[2][5] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement9 == 6)
							{
								board[2][9] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement9 == 7)
							{
								board[4][1] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement9 == 8)
							{
								board[4][5] = "x";
								for (int row = 0; row < board.length; row++)
									{
										for (int col = 0; col < board[0].length; col++)
											{
												System.out.print(board[row][col]);
											}
										System.out.println();
									}
							}
						else if (piecePlacement9 == 9)
							{
								board[4][9] = "x";
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
				if ((board[0][1] == "x" && board[2][1] == "x" && board[4][1] == "x")
						|| (board[0][5] == "x" && board[2][5] == "x" && board[4][5] == "x")
						|| (board[0][9] == "x" && board[2][9] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[0][5] == "x" && board[0][9] == "x")
						|| (board[2][1] == "x" && board[2][5] == "x" && board[2][9] == "x")
						|| (board[4][1] == "x" && board[4][5] == "x" && board[4][9] == "x")
						|| (board[0][1] == "x" && board[2][5] == "x" && board[4][9] == "x")
						|| (board[0][9] == "x" && board[2][5] == "x" && board[4][1] == "x"))
					{
						System.out.println("You won!");
					}
				else
					{
						System.out.println("It's a tie!");
					} */
			}
	
		public static void replaceNumberx()
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
	
		public static void replaceNumbero()
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
		
		public static void gainInput()
		{
			System.out.println("Where would you like to put your first piece?");
			Scanner scanner = new Scanner(System.in);
			int piecePlacement = scanner.nextInt();
		}
	}
