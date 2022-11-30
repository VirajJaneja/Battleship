
public class PlayerEvaluator {
	private int minRuns = 100;
	private int maxRuns = 0;
	private float averageRuns;
	
	PlayerEvaluator(ComputerBattleshipPlayer player, int runs){
		int runSum = 0;
		int tempValue;
		for(int i = 0; i<runs;i++) {
			BattleshipGame tempGame = new BattleshipGame(player);
			tempValue = tempGame.play();
			runSum += tempValue;
			if(minRuns>tempValue)
				minRuns = tempValue;
			if(maxRuns<tempValue)
				maxRuns = tempValue;
		}
		averageRuns = (float)runSum/runs;
	}
	
	public int maxTurns() {
		return maxRuns;
	}
	
	public int minTurns() {
		return minRuns;
	}
	
	public float averageTurns() {
		return averageRuns;
	}
}
