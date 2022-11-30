public class BattleshipGame {
	Ocean gameOcean;
	int turns;
	private BattleshipPlayer player;
	public BattleshipGame(BattleshipPlayer playerc) {
		gameOcean = new Ocean();
		gameOcean.placeAllBoats();
		turns = 0;
		player = playerc;
		player.startGame();
	}
	
	public int play() {
		boolean x = true;
		while(x) {
			turns++;
			Position shotPos = player.shoot();
			gameOcean.shootAt(shotPos);
			player.updatePlayer(shotPos, gameOcean.hit(shotPos), gameOcean.boatInitial(shotPos), gameOcean.boatName(shotPos), gameOcean.sunk(shotPos), gameOcean.allSunk(), tooManyTurns(), turns);
			if(tooManyTurns() || gameOcean.allSunk())
				x = false;
		}
		return turns;
	}
	
	private boolean tooManyTurns() {
		if(turns>=100)
			return true;
		return false;
	}
}
