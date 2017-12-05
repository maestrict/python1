/**
 * 
 */
package model;

/**
 * Groupe 10
 * sous classe héritée de bateaux
 * @author Nathan Voss
 *
 */
public class Torpilleur extends Bateaux {
	public static final int taille = 2;
	public static String nomBateau = "Torpilleur";
	public static final char bId = 'T';	
	public static int vieBateau = 2;
	public static boolean coule = true;


	public Torpilleur() {
		super(taille, bId, nomBateau, vieBateau, coule);
	}

}
	

