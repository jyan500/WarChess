package pieces;
import chess.GameState;
import terrain.Field;
import building.Building;
import chess.CoordinatePair;
import java.util.ArrayList;
public interface Piece {
	public String getColor();
	public CoordinatePair getCoord();
	public void setCoord(int x, int y);
	public ArrayList<CoordinatePair>getValidMoves(GameState state);
	public int getHitPoints();
	public void setHitPoints(int damage);
	public String toString();
	public Inventory getInventory();
	public void updateInventory();
	public void attack(Piece piece);
	public void defend(Piece piece);
	public void inspect();
	public void visit();
	
}
