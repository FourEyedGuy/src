package ghost;

public class Good extends Pawn {
	private String[] winningPositions = new String[2];
	
	public Good(int line, int column, String winningPosition1, String winingPosition2) {
		super(line, column);
		
		winningPositions[0] = winningPosition1;
		winningPositions[1] = winingPosition2;
	}

	@Override
	public boolean isGood() {
		return true;
	}

}
