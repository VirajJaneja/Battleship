public class BoatTester {

	public static void main(String[] args) {
		BoatConstructorTester();
		nameAndAbrvTester();
		sizeAndOnboatTester();
		hitAndIsHitTester();
		sunkTester();
		posAndDirTester();
	}
	
	private static void BoatConstructorTester(){
		System.out.println("--------BoatConstructorTester-------");

		Boat testboat1 = new Boat("Aircraft Carrier", new Position('g', 4), "vertical");
		System.out.println("1: " + testboat1.position());
		
		Boat testboat2 = new Boat("Battleship", new Position('g', 4), "vertical");
		System.out.println("2: " + testboat2.position());
		
		Boat testboat3 = new Boat("Cruiser", new Position('g', 4), "vertical");
		System.out.println("3: " + testboat3.position());
		
		Boat testboat4 = new Boat("Submarine", new Position('g', 4), "vertical");
		System.out.println("4: " + testboat4.position());
		
		Boat testboat5 = new Boat("Destroyer", new Position('g', 4), "vertical");
		System.out.println("5: " + testboat5.position());
		
		Boat testboat6 = new Boat("Submarine", new Position('g', 4), "Horizontal");
		System.out.println("6: " + testboat6.position());
		
		Boat testboat7 = new Boat("suBMARINE", new Position('g', 4), "vertical");
		System.out.println("7: " + testboat7.position());
		
		Boat testboat8 = new Boat("Aircraft Carrier", new Position('A',1), "horizontal");
		System.out.println("8: " + testboat8.position());
		
		Boat testboat9 = new Boat("Aircraft Carrier", new Position('j', 4), "horizontal");
		System.out.println("9: " + testboat9.position());
		
		Boat testboat10 = new Boat("Cruiser", new Position('A', 1), "vertical");
		System.out.println("10: " + testboat10.position());
		
		Boat testboat11 = new Boat("Cruiser", new Position('F', 10), "vertical");
		System.out.println("11: " + testboat11.position());
		
		Boat testboat12 = new Boat("Aircraft Carrier", new Position('g', 4), "vertical");
		System.out.println("12: " + testboat12.position());
		
		Boat testboat13 = new Boat("Aircraft Carrier", new Position('f', 12), "vertical");
		System.out.println("13: " + testboat13.position());
				
		Boat testboat14 = new Boat("Aircraft Carrier", new Position('g', 4), "vertical");
		System.out.println("14: " + testboat14.position());
		
		Boat testboat15 = new Boat("Aircraft Carrier", new Position('z', 4), "vertical");
		System.out.println("15: " + testboat15.position());
		
		Boat testboat16 = new Boat("Aircraft Carrier", new Position('g', 4), "diagonal");
		System.out.println("16: "+ testboat16.direction());
		
		Boat testboat17 = new Boat("Aircraft Carrier", new Position('g', 4), "vertical");
		System.out.println("17: " + testboat17.position());
		
		Boat testboat18 = new Boat("Aircraft Carrier", new Position('a', 9), "horizontal");
		System.out.println("18: " + testboat18.position());
		
		Boat testboat19 = new Boat("Aircraft Carrier", new Position('i', 4), "vertical");
		System.out.println("19: " + testboat19.position());
		
		Boat testboat20 = new Boat("", new Position('g', 4), "vertical");
		System.out.println("20: " + testboat20.name());
		
		Boat testboat21 = new Boat("Aircraft Carrier", new Position('g', 4), "");
		System.out.println("21: " + testboat21.position());
	}
	
	private static void nameAndAbrvTester() {
		System.out.println("--------nameAndAbrvTester-------");

		Boat tb1 = new Boat("Aircraft Carrier", new Position('G', 2), "vertical");
		Boat tb2 = new Boat("Destroyer", new Position('G', 2), "vertical");
		Boat tb3 = new Boat("Battleship", new Position('G', 2), "vertical");
		Boat tb4 = new Boat("Submarine", new Position('G', 2), "vertical");
		Boat tb5 = new Boat("Cruiser", new Position('G', 2), "vertical");
		System.out.println(tb1.name());
		System.out.println(tb2.name());
		System.out.println(tb3.name());
		System.out.println(tb4.name());
		System.out.println(tb5.name());
		System.out.println(tb1.abbreviation());
		System.out.println(tb2.abbreviation());
		System.out.println(tb3.abbreviation());
		System.out.println(tb4.abbreviation());
		System.out.println(tb5.abbreviation());


	}

	
	private static void sizeAndOnboatTester() {
		System.out.println("--------sizeAndOnboatTester-------");

		Boat tb1 = new Boat("Aircraft Carrier", new Position('G', 2), "vertical");
		Boat tb2 = new Boat("Destroyer", new Position('a', 1), "vertical");
		Boat tb3 = new Boat("Battleship", new Position('f', 4), "vertical");
		Boat tb4 = new Boat("Submarine", new Position('d', 8), "vertical");
		Boat tb5 = new Boat("Cruiser", new Position('e', 5), "vertical");
		System.out.println(tb1.size());
		System.out.println(tb2.size());
		System.out.println(tb3.size());
		System.out.println(tb4.size());
		System.out.println(tb5.size());

		System.out.println("------------");
		System.out.println(tb1.onBoat(new Position('G', 2)));
		System.out.println(tb1.onBoat(new Position('h', 2)));
		System.out.println(tb1.onBoat(new Position('a', 1)));
		System.out.println(tb1.onBoat(new Position('z', 12)));
	}
	
	private static void hitAndIsHitTester() {
		System.out.println("--------hitAndIsHitTester-------");

		Boat tb1 = new Boat("Destroyer", new Position('a', 1), "vertical");
		tb1.hit(new Position('a',1));
		tb1.hit(new Position('b',1));
		tb1.hit(new Position('g',3));
		tb1.hit(new Position('z',12));
		
		System.out.println(tb1.isHit(new Position('a', 1)));
		System.out.println(tb1.isHit(new Position('b', 1)));
		System.out.println(tb1.isHit(new Position('g', 3)));
		System.out.println(tb1.isHit(new Position('z', 12)));
	}
	
	private static void sunkTester() {
		System.out.println("--------sunkTester-------");
		Boat tb1 = new Boat("Aircraft Carrier", new Position('f', 2), "horizontal");
		Boat tb2 = new Boat("Destroyer", new Position('a', 1), "vertical");
		Boat tb3 = new Boat("Battleship", new Position('f', 4), "vertical");
		Boat tb4 = new Boat("Submarine", new Position('d', 8), "vertical");
		Boat tb5 = new Boat("Cruiser", new Position('e', 5), "vertical");
		
		tb4.hit(new Position('d', 8));
		System.out.println(tb4.sunk());
		tb4.hit(new Position('e', 8));
		System.out.println(tb4.sunk());
		tb4.hit(new Position('f', 8));
		System.out.println(tb4.sunk());
		System.out.println(tb2.sunk());
		
		tb1.hit(new Position('f', 2));
		tb1.hit(new Position('f', 3));
		tb1.hit(new Position('f', 4));
		tb1.hit(new Position('f', 5));
		tb1.hit(new Position('f', 6));
		System.out.println(tb1.sunk());
		
		tb2.hit(new Position('a', 1));
		tb2.hit(new Position('b', 1));
		System.out.println(tb2.sunk());
		
		tb3.hit(new Position('f', 4));
		tb3.hit(new Position('g', 4));
		tb3.hit(new Position('h', 4));
		tb3.hit(new Position('i', 4));
		System.out.println(tb3.sunk());
		
		tb5.hit(new Position('e', 5));
		tb5.hit(new Position('f', 5));
		tb5.hit(new Position('g', 5));
		System.out.println(tb5.sunk());
	}
	
	private static void posAndDirTester() {
		
		System.out.println("--------posAndDirTester-------");
		Boat tb1 = new Boat("Aircraft Carrier", new Position('f', 2), "horizontal");
		Boat tb2 = new Boat("Destroyer", new Position('a', 1), "vertical");
		Boat tb3 = new Boat("Battleship", new Position('f', 4), "vertical");
		Boat tb4 = new Boat("Submarine", new Position('d', 8), "vertical");
		Boat tb5 = new Boat("Cruiser", new Position('e', 5), "vertical");
		
		System.out.println(tb1.position());
		System.out.println(tb1.direction());
		System.out.println(tb2.position());
		System.out.println(tb2.direction());
		System.out.println(tb3.position());
		System.out.println(tb3.direction());
		System.out.println(tb4.position());
		System.out.println(tb4.direction());
		System.out.println(tb5.position());
		System.out.println(tb5.direction());
	}
}
