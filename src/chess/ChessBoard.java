package chess;
import java.util.ArrayList;

public class ChessBoard 
{
	private final int rows;
	private final int columns;
	private ArrayList <ArrayList<BoardSpot>> board = new ArrayList();
	ChessBoard()
	{
		this.rows = 50;
		this.columns = 50;
		for (int i = 0; i < rows; i++)
		{
			ArrayList <BoardSpot> innerArray = new ArrayList();
			board.add(innerArray);
			for (int j = 0; j < rows; j++)
			{
				BoardSpot spot = new BoardSpot();
				spot.setCoord(i, j);
				board.get(board.size() - 1).add(spot);
			}
		}
	}
	public void printBoard()
	{
		for (int i = 0; i < rows; i++)
		{
			//System.out.print(rows - i + " ");
			for (int j = 0; j < columns; j++)
			{
				System.out.print(board.get(i).get(j) + " ");
			}
			System.out.println();
		}
//		String[] columnNum = {"a", "b", "c", "d", "e", "f", "g", "h"};
//		System.out.print("  ");
//		for (int i = 0; i < rows; i++)
//		{
//			System.out.print(columnNum[i] + " ");
//		}
			
	}
	public ArrayList<ArrayList<BoardSpot>> getBoard()
	{
		return board;
	}
	
	

}
