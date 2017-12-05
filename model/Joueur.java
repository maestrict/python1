/**
 * 
 */
package model;

import java.util.Scanner;

/**
 * Groupe 10
 * Classe de création des joueurs
 * @param nom - permet d'indiquer le "pseudo" d'un joueur
 * @author Gossiaux Christophe - 2TL1
 *
 */
public class Joueur {
	private String nom;

	
	public Joueur(String nom){
		this.nom = nom;
	}
	
	public String getNom(){
		return nom;
	}


	/**
	 * Oblige l'utilisateur a indiqué un nom
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joueur other = (Joueur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	

	
	

}
