package chess;
import pieces.Piece;
import terrain.Terrain;

public class BoardSpot {
	private Piece currentPiece;
	private Terrain currentTerrain;
	private Building currentBuilding;
	private CoordinatePair coord;
	public BoardSpot()
	{
		currentPiece = null;
		currentTerrain = null;
		currentBuilding = null;
		coord = new CoordinatePair();
	}
	public CoordinatePair getCoord()
	{
		return coord;
	}
	public void setCoord(int x, int y)
	{
		this.coord.setX(x);
		this.coord.setY(y);
	}
	public String toString()
	{
		if (currentPiece == null && currentTerrain == null)
			return "*";
		else if (currentPiece != null)
		{
			return currentPiece.toString();
		}
		else
		{
			return currentTerrain.toString();
		}
		
	}
	public Piece getCurrentPiece() {
		return currentPiece;
	}
	public void setCurrentPiece(Piece currentPiece) {
		this.currentPiece = currentPiece;
	}
	public Terrain getCurrentTerrain() {
		return currentTerrain;
	}
	public void setCurrentTerrain(Terrain currentTerrain) {
		this.currentTerrain = currentTerrain;
	}
	
	
}
