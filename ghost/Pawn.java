package ghost;

import constantes.Direction;

/**
 * Pion
 * 
 * @author Edgar Liang, Li Huanghuang
 */
public abstract class Pawn{
	private int line;
	private int column;
	
	/**
	 * Constructeur
	 */
	public Pawn(int line, int column){
		this.line = line;
		this.column = column;
	}
	
	/**
	 * (� faire) donne la coordonn�e en String
	 * @return
	 */
	public String getPosition() {
		return toString();
	}
	
	private void setPosition(int line, int column) {
		this.line = line;
		this.column = column;
	}
	
	/**
	 * (� faire) d�placer le pion � la position indiqu�e
	 * @param square la case vers lequel d�placer le pion
	 */
	public void move(String square){
		
	}
	
	/**
	 * d�place le pion � position indiqu�e
	 * @param square la case vers lequel d�placer le pion
	 */
	public void move(int line, int column){
		setPosition(line, column);
	}
	
	/**
	 * (� faire) donne l'ensemble des coordon�es possibles 
	 * @return
	 */
	public int[][] possibleMoves(){
		return null;
	}
	
	/**
	 * (� faire) si le pion est un bon fant�me
	 * @return true si c'est un bon fant�me
	 */
	public abstract boolean isGood();
	
	/**
	 * � faire
	 */
	public String toString(){
		return null;
	}
}
