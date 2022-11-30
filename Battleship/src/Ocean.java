
public class Ocean extends GoodOcean{
	public void placeAllBoats() {
		boolean a = false;
		boolean b = false;
		boolean c = false;
		boolean d = false;
		boolean s = false;
		boolean[] checks = {a, b, c, d, s};
		String[] boatTypes = {"Aircraft Carrier", "Battleship", "Cruiser", "Destroyer", "Submarine"};
		
		while(!(((checks[1] && checks[2])&&(checks[3]&&checks[4]))&&checks[0])) {
			for(int i = 0; i<5; i++) {
				if(!checks[i]) {
					try {
						this.placeBoat(boatTypes[i], randomDir(), randomPos());
						checks[i]= true;
					} catch (Exception e) {
					}
				}
			}
		}
	}
	private Position randomPos() {
		return new Position((int)(Math.random()*10), (int)(Math.random()*10));
	}
	
	private String randomDir() {
		if(((int)(Math.random()*100)) % 2 == 0)
			return "horizontal";
		else
			return "vertical";
	}
}
