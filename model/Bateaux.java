/**
 * 
 */
package model;

/**
 * Groupe 10
 * @author Nathan Voss, Gossiaux Christophe, Maes Arnaud 
 * @param taille
 * @param bId - affichage d'un charactère en mode console re
 * @param nomBateau
 * @param coule - état du bâteau - false par défaut.
 * 
 */
public abstract class Bateaux {
	public int taille; 
	public char bId;
	public static String nomBateau; 
	public static int vieBateau;
	public static boolean coule;


	/**Constructeur*/
	public Bateaux(int taille, char bId, String nomBateau, int vieBateau,boolean coule){
		this.taille = taille;
		this.bId = bId;
		this.nomBateau = nomBateau;
		this.vieBateau = vieBateau;
		this.coule = coule;
	}

		
	/**Getters*/ 

	public int getTaille() {
		return taille;
	}

	public char getbId() {
		return bId;
	}

	public static String getNomBateau() {
		return nomBateau;
	}

	public int getVieBateau(){
		return vieBateau;
	}
	
	public static boolean coule(){
		return coule;
	}







}
