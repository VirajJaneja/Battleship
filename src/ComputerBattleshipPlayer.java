import java.util.*;

public class ComputerBattleshipPlayer extends BattleshipPlayer{
	ArrayList<Position> shotAt = new ArrayList<Position>();

	
	public void updatePlayer(Position pos, boolean hit, char initial, String boatName, 
	boolean sunk, boolean gameOver, boolean tooManyTurns, int turns) {
		updateGrid(pos, hit, initial);
	}
	
	public String playerName() {
		return "Computer Player";
	}
	
	public Position shoot() {
		Position result;
		do {
			result = new Position((int)(Math.random()*10), (int)(Math.random()*10));
		} while (isPosUsed(result));
		shotAt.add(result);
		return result;
	}
	
	public void startGame() {
		shotAt.clear();
		super.initializeGrid();
	}

	private boolean isPosUsed(Position pos) {
		for(Position item: shotAt) {
			if(pos.toString().equals(item.toString())) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
