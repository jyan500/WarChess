package terrain;
import chess.CoordinatePair;
public class Mountain implements Terrain{
	private int defensiveBonus;
	private CoordinatePair coord;
	public int getDefensiveBonus()
	{
		return defensiveBonus;
	}
	public void setDefensiveBonus()
	{
		defensiveBonus = 2;
	}
	public Mountain(int x, int y)
	{
		coord = new CoordinatePair();
		coord.setX(x);
		coord.setY(y);
	}
	public CoordinatePair getCoord()
	{
		return coord;
	}
	public String toString()
	{
		return "M";
	}
}
