
public class tester {

	public static void main(String[] args) {
//		gridTester();
//		randomOceanTester();
		BattleshipPlayer player = new BattleshipPlayer();
		BattleshipGame game = new BattleshipGame(player);
		System.out.println(game.play());
	}
	
	static public void positionTester() {
		System.out.println("-----test 1------");
		Position test1 = new Position(3, 4);
		System.out.println("row: " + test1.row());
		System.out.println("column: " + test1.column());
		System.out.println("row index: " + test1.rowIndex());
		System.out.println("col index: " + test1.columnIndex());
		System.out.println("toString: " + test1.toString());
		
		System.out.println("-----test 2------");
		Position test2 = new Position('A', 0);
		System.out.println("row: " + test2.row());
		System.out.println("column: " + test2.column());
		System.out.println("row index: " + test2.rowIndex());
		System.out.println("col index: " + test2.columnIndex());
		System.out.println("toString: " + test2.toString());

		System.out.println("-----test 3------");
		Position test3 = new Position();
		System.out.println("row: " + test3.row());
		System.out.println("column: " + test3.column());
		System.out.println("row index: " + test3.rowIndex());
		System.out.println("col index: " + test3.columnIndex());
		System.out.println("toString: " + test3.toString());
		
		System.out.println("-----test 4------");
		Position test4 = new Position();
		System.out.println("row: " + test4.row());
		System.out.println("column: " + test4.column());
		System.out.println("row index: " + test4.rowIndex());
		System.out.println("col index: " + test4.columnIndex());
		System.out.println("toString: " + test4.toString());
		
	}

	public static void gridTester() {
		BattleshipGrid grid = new BattleshipGrid();
		System.out.println("empty: " + grid.empty(new Position('g', 4)));
		grid.shotAt(new Position('c',4), true, 'A');
		System.out.println("hit: " + grid.hit(new Position('c', 4)));
		grid.shotAt(new Position('c',7), false, 'd');
		System.out.println("hit: " + grid.hit(new Position('c',7)));
		System.out.println("miss: " + grid.miss(new Position('c',7)));
		System.out.println("empty: " + grid.empty(new Position('c',7)));
	}

	public static void randomOceanTester() {
		Ocean Ocean1 = new Ocean();
		Ocean1.placeAllBoats();
		Ocean1.printBoatLocations();
		for(int i = 0;i<10;i++) {
			for(int j = 0;j<10;j++) {
				System.out.println(Ocean1.boatName(new Position(i, j)));
				
			}
		}
	}
	
}

