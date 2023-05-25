package main;

/**
 * La classe Tile rappresenta una tessera con una posizione e un colore
 * associati.
 */

public class Tile {

	private Position P;
	private Color c;

	/**
	 * Costruisce un oggetto Tile con la posizione e il colore specificati.
	 *
	 * @param P la posizione della tessera
	 * @param c il colore della tessera
	 */

	public Tile(Position P, Color c) {
		this.P = P;
		this.c = c;
	}

	/**
	 * Costruisce un oggetto Tile con una posizione vuota e senza colore.
	 */

	public Tile() {
		Position pos = new Position();
		this.P = pos;
	}

	/**
	 * Restituisce la coordinata x della posizione della tessera.
	 *
	 * @return la coordinata x della posizione
	 */

	public int getTile() {
		return P.getX();
	}

	/**
	 * Restituisce il colore della tessera.
	 *
	 * @return il colore della tessera
	 */

	public Color getColor() {
		return this.c;
	}

	/**
	 * Restituisce la posizione della tessera.
	 *
	 * @return la posizione della tessera
	 */

	public Position getP() {
		return P;
	}
}
