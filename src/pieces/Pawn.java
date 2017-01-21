package pieces;
import java.util.ArrayList;
import chess.CoordinatePair;
import chess.GameState;
public class Pawn implements Piece{
	private CoordinatePair coord;
	private String color;
	private int hitPoints;
	private ArrayList<CoordinatePair> listOfValidMoves = new ArrayList<CoordinatePair>();
	public Pawn(int x, int y, String color)
	{
		coord = new CoordinatePair();
		coord.setX(x);
		coord.setY(y);
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	public CoordinatePair getCoord()
	{
		return coord;
	}
	public void setCoord(int x, int y)
	{
		coord.setX(x);
		coord.setY(y);
	}
	public ArrayList<CoordinatePair>getValidMoves(GameState state)
	{
		// Come Back Later
		return listOfValidMoves;
	}
	public String toString()
	{
		return color + "P";
	}
	public int getHitPoints()
	{
		return hitPoints;
	}
	public void setHitPoints(int damage)
	{
		this.hitPoints -= damage;
	}
}
