package ghost;

public class Bad extends Pawn {

	public Bad(int line, int column) {
		super(line, column);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isGood() {
		return false;
	}

}
