
public class RunPositionCheckerTester {
	//DO NOT CHANGE THIS METHOD. IF IT HAS ERRORS, FIX YOUR OWN CODE.
	public static void aliveness(){
		Position p1=new Position(0,0);
		Position p2=new Position('A',1);
		int c=p1.column(), ri=p1.rowIndex(), ci=p1.columnIndex();
		char r=p1.row();
		Position p3 = PositionChecker1.checkPosition("");
	}

	public static void main(String[] args) {
		PositionCheckerTester pct = new PositionCheckerTester();
		pct.runTestCases();
	}

}
