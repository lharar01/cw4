package app;

/**
 * <p>Subclass of class Ship. Represents a Ship 4-spaces long.</p>
 * <p>It is a part of the Battleship game application, which is run by the class <code>BattleshipGame</code>.</p>
 * <p>Its toString method returns "Battleship".</p>
 * 
 * @author Liran Harary (lharar01, 12837230)
 * @version 1.0
 * @since 17th December 2014
 */
public class Battleship extends Ship {
	
	/**
	 * <p>Sets the <code>length</code> to 4.</p>
	 * <p>Sets all elements in the <code>hit</code> array to <code>false</code>.</p>
	 */
	public Battleship() {
		length = 4;
		for(int i=0; i<hit.length; i++) {
			hit[i] = false;
		}
	}
	
	/**
	 * Returns this <code>Ship's</code> type.
	 * 
	 * @return "Battleship"
	 */
	@Override
	public String getShipType() {
		return "Battleship";
	}
	
}