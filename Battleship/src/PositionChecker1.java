
public class PositionChecker1 {
	public static Position checkPosition(String inputPos) {
		
		boolean rowChecksOut = false;
		boolean colChecksOut = false;
		Position result = result = new Position('@', 0);
		if(inputPos.length()==3) {
			String[] properChars = {"a","b","c","d","e","f","g","h","i","j"};
			for(String letter:properChars) {
				if(inputPos.substring(0,1).toUpperCase().equals(letter.toUpperCase())) {
					rowChecksOut = true;
				}
			}
			char num = inputPos.charAt(2);
			if(num < 58 && num > 48) {
				colChecksOut = true;
			}
			if(rowChecksOut && colChecksOut)
				result = new Position(inputPos.charAt(0), Integer.parseInt(inputPos.substring(2)));
		}
		System.out.println(colChecksOut + " " + rowChecksOut);
		return result;
	}
}
