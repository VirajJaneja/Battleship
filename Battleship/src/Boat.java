import java.util.*;

public class Boat {
	Position location;
	String heading;
	String[] boatTypes = {"Aircraft Carrier", "Battleship", "Cruiser", "Destroyer", "Submarine"};
	String name;
	ArrayList<Position> hitlist = new ArrayList<Position>();

	
	public Boat(String s, Position p, String d) {
		for(String type: boatTypes) {
			if(s.equals(type))
				name = s;
		}
		location = p;
		if(d.equals("vertical") || d.equals("horizontal"))
			heading = d;
	}
	
	public String name() {
		return name;
	}
	public char abbreviation() {
		return name().charAt(0);
	}
	public int size() {
		switch(abbreviation()) {
		case 'A':
			return 5;
		case 'B':
			return 4;
		case 'C':
			return 3;
		case 'S':
			return 3;
		default:
			return 2;
		}
	}
	
	
	public boolean onBoat(Position p) {
		if(heading.equals("vertical")) {
			if(p.columnIndex() == location.columnIndex()) {
				if(p.rowIndex() >= location.rowIndex() && p.rowIndex()<location.rowIndex()+size()) {
					return true;
				} else
					return false;
			} else
				return false;
		}
		if(heading.equals("horizontal")) {
			if(p.rowIndex() == location.rowIndex()) {
				if(p.columnIndex() >= location.columnIndex() && p.columnIndex()<location.columnIndex()+size()) {
					return true;
				} else
					return false;
			} else
				return false;
		}
		return false;
		
	}
	
	public boolean isHit(Position p) {
		for(Position pos:hitlist) {
			if(p.rowIndex() == pos.rowIndex() && p.columnIndex() == pos.columnIndex())
				return true;
		}
		return false;
	}
	public void hit(Position p) {
		if(!isHit(p) && onBoat(p))
			hitlist.add(p);
	}
	public boolean sunk() {
		if(hitlist.size() == size())
			return true;
		return false;
	}
	public Position position() {
		return location;
	}
	public String direction() {
		return heading;
	}
	
	
}
