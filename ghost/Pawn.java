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
	 * (à faire) donne la coordonnée en String
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
	 * (à faire) déplacer le pion à la position indiquée
	 * @param square la case vers lequel déplacer le pion
	 */
	public void move(String square){
		
	}
	
	/**
	 * déplace le pion à position indiquée
	 * @param square la case vers lequel déplacer le pion
	 */
	public void move(int line, int column){
		setPosition(line, column);
	}
	
	/**
	 * (à faire) donne l'ensemble des coordonées possibles 
	 * @return
	 */
	public int[][] possibleMoves(){
		return null;
	}
	
	/**
	 * (à faire) si le pion est un bon fantôme
	 * @return true si c'est un bon fantôme
	 */
	public abstract boolean isGood();
	
	/**
	 * à faire
	 */
	public String toString(){
		return null;
	}
}
