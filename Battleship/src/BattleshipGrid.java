public class BattleshipGrid {
	private String[][] Grid = new String[10][10];
	private boolean gridSet = false;

	public void shotAt(Position pos, boolean hit, char initial) {
		setupGrid();
		if(hit)
			Grid[pos.rowIndex()][pos.columnIndex()] = "" + initial;
		if(!hit)
			Grid[pos.rowIndex()][pos.columnIndex()] = "MISS";
	}
	
	public boolean hit(Position pos) {
		setupGrid();
		if(!miss(pos) && !empty(pos))
			return true;
		return false;
	}
	public boolean miss(Position pos) {
		setupGrid();
		if(Grid[pos.rowIndex()][pos.columnIndex()].equals("MISS"))
			return true;
		return false;
	}
	public boolean empty(Position pos) {
		setupGrid();
		if(Grid[pos.rowIndex()][pos.columnIndex()].equals("EMPTY"))
			return true;
		return false;
	}
	public char boatInitial(Position pos) {
		setupGrid();
		return Grid[pos.rowIndex()][pos.columnIndex()].charAt(0);
	}
	
	private void setupGrid(){
		if(!gridSet) {
			for(int i = 0; i<10; i++) {
				for(int j =0; j<10; j++) {
					Grid[i][j] = "EMPTY";
				}
			}
		}
		gridSet = true;
	}
}
