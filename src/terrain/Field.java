package terrain;
import chess.CoordinatePair;
public class Field extends Mountain implements Terrain {
	private int defensiveBonus;
	
	public Field(int x, int y)
	{
		super(x, y);
	}
	public void setDefensiveBonus()
	{
		defensiveBonus = 1;
	}
	public String toString()
	{
		return "F";
	}
}
