package chess;
import java.util.ArrayList;
import player.Opponent;
import player.Player;
public class GameState {
	private Player player;
	private Opponent opponent;
	private ChessBoard board;
	private Turn turn;
	private String playerColor;
	private String opponentColor;
	public GameState()
	{
		playerColor = "White";
		opponentColor = "Black";
		board = new ChessBoard();
		player = new Player(playerColor);
		opponent = new Opponent(opponentColor);
		turn = new Turn();
	}
	public void run()
	{
		// user inputs, or in the future, working with the GUI
		board.printBoard();
	}
}
