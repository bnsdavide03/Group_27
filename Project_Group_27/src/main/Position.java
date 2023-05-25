package main;

/**
 * La classe Position rappresenta una posizione nel sistema di coordinate (x,y).
 */

public class Position {

	private int x;
	private int y;

	/**
	 * Costruisce un oggetto Position con le coordinate specificate.
	 *
	 * @param x = la coordinata x
	 * @param y = la coordinata y
	 */

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Costruisce un oggetto Position con coordinate vuote (-1, -1).
	 */

	public Position() {
		this.x = -1;
		this.y = -1;
	}

	/**
	 * Restituisce la coordinata x.
	 *
	 * @return la coordinata x
	 */

	public int getX() {
		return x;
	}

	/**
	 * Restituisce la coordinata y.
	 *
	 * @return la coordinata y
	 */

	public int getY() {
		return y;
	}

}
