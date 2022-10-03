import java.util.Scanner;

public class Position {
	private char rowPos;
	private int colPos;
	char[] properChars = {'A','B','C','D','E','F','G','H','I','J'};

	public Position(char c, int n) {
		rowPos = Character.toUpperCase(c);
		colPos = n;
	}
	public Position(int rowIndex, int colIndex) {
		colPos = ++colIndex;
		rowPos = properChars[rowIndex];
	}
	public Position() {
		PositionChecker check = new PositionChecker();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a position:");
		String input = scanner.nextLine();
		Position x = check.checkPosition(input);
		colPos = x.colPos;
		rowPos = x.rowPos;
	}
	public char row() {
		return rowPos;
		
	}
	public int column() {
		return colPos;
	}
	public int rowIndex() {
		for(int i = 0; i<10; i++) {
			if(rowPos == properChars[i])
				return i;
		}
		return -1;
	}
	public int columnIndex() {
		int x = colPos;
		return --x;
	}
	
	public String toString() {
		return row() + "-" + column();
	}
	
	
}

