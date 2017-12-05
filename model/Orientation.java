/**
 * 
 */
package model;

/**
 * Groupe 10
 * Classe qui permet le choix de l'orientation en mode graphique.
 * Utilisation d'une classe eNum
 * @author Gossiaux Christophe
 * @param deltaX
 * @param deltaY
 * Classe a été écrite à l'aide de plusieurs forums
 * https://docs.oracle.com/javafx/2/api/javafx/geometry/Orientation.html
 *
 */
public enum Orientation {
	GAUCHE(-1,0),
	DROITE(1,0),
	HAUT(0,-1),
	BAS(0,1);
	
	
	
	private int deltaX;
	private int deltaY; 
	
	Orientation(int deltaX, int deltaY){
		this.deltaX = deltaX;
		this.deltaY = deltaY; 
	}
	
	/**Getter*/
	int horizontal(){
		return deltaX;
	}
	
	int vertical(){
		return deltaY;
	}

}
