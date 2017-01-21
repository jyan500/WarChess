package terrain;
import chess.CoordinatePair;
public interface Terrain {
	public int getDefensiveBonus();
	public CoordinatePair getCoord();
	public String toString();
	
}
