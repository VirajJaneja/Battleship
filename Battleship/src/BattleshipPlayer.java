import java.util.Scanner;

public class BattleshipPlayer {
	private String name;
	private BattleshipGrid gameGrid;
	Scanner scanner = new Scanner(System.in);
	public BattleshipPlayer() {
		name = null;
	}
	
	public void startGame() {
		gameGrid = new BattleshipGrid();
		if(name == null) {
			System.out.println("Please enter your name: ");
			String input = scanner.nextLine();
			name = input;
		}
		System.out.println("Welcome to Battleship!");
	}
	
	public String playerName() {
		return name;
	}
	
	public Position shoot() {
		Position result;
		boolean valid = false;
		do {
			result = new Position();
			if(result.column() != 0)
				valid = true;
			else
				System.out.println("ERROR: Please enter a valid Position.");
		} while(!valid);
		return result;
	}
	
	public void updateGrid(Position pos, boolean hit, char initial) {
		gameGrid.shotAt(pos, hit, initial);
	}
	
	public BattleshipGrid getGrid() {
		return gameGrid;
	}
	
	public void initializeGrid() {
		gameGrid = new BattleshipGrid();
	}
	
	public void updatePlayer(Position pos, boolean hit, char initial, String boatName, 
	boolean sunk, boolean gameOver, boolean tooManyTurns, int turns) {
		if(tooManyTurns)
			System.out.println("You have taken too many turns.");
		else {
			updateGrid(pos, hit, initial);
			System.out.println("   1 2 3 4 5 6 7 8 9 10");
			for(int i = 0, k='A'; i<10; i++, k++) {
				System.out.print((char)k + "  ");
				for(int j = 1;j<11;j++) {
					if(gameGrid.empty(new Position((char)k, j)))
						System.out.print(". ");
					if(gameGrid.miss(new Position((char)k, j)))
						System.out.print("* ");
					if(gameGrid.hit(new Position((char)k, j)))
						System.out.print(gameGrid.boatInitial(new Position((char)k, j)) + " ");
				}
				System.out.println();
			}
			String shot;
			if(hit)
				shot = "hit";
			else
				shot = "miss";
			if(gameOver)
				System.out.println("The game is over.");
			else {
				System.out.print("Turn #" + turns + ": ");
				System.out.println("Your shot at " + pos.toString() + " was a " + shot + ".");
				if(hit) {
					System.out.println("The hit ship was a " + boatName);
					if(sunk)
						System.out.println("The ship was sunk.");
					else
						System.out.println("The ship was not sunk.");
				}
			}
		}
		System.out.println();
	}
	
	
}
