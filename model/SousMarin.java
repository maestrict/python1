/**
 * 
 */
package model;

/**
 * Groupe 10
 * sous classe héritée de bateaux
 * @author Nathan Voss
 * @param bId - représentation "graphique" d'un bateau dans le mode console
 *
 */
public class SousMarin extends Bateaux {
	public static final int taille = 3;
	public static String nomBateau = "Sous-Marin";
	public static final char bId = 'S';	
	public static int vieBateau = 3;
	public static boolean coule = true;
	

	public SousMarin() {
		super(taille, bId, nomBateau, vieBateau, coule);
	}

}
