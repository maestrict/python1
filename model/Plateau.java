/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

import exception.CaseToucheeException;
import exception.HorsPlateauException;
import exception.PositionInvalideException;

/**
 * @author Gossiaux Christophe, Voss Nathan, Maes Arnaud
 * @version 2 La classe "Plateau" permet la construction du plateau de jeu
 *
 */
public class Plateau {
	private int ligne = 11;
	private int colonne = 11;
	private char caseVide = '#'; // affiche la case vide losque le plateau est
									// créée (sans bateaux)
	private char caseTouche = 'X';
	private char caseRatee = 'O';
	private final char[][] grille;

	/**
	 * Iniatilise le plateau
	 * 
	 * @param ligne
	 * @param colonne
	 * @param caseVide
	 *            Valeur fixe, crée un plateau de 10 sur 10.
	 */
	public Plateau() {
		grille = new char[ligne][colonne];
		for (int i = 1; i < ligne; i++) {
			for (int j = 1; j < colonne; j++) {
				grille[i][j] = caseVide;
			}
		}

	}

	/**
	 * Définit la limitation du plateau, un bateau ne pourra être placé si la
	 * valeur de ligne ou colonne est > 10
	 * 
	 * @param X
	 *            - la case d'une ligne fait partie du plateau
	 * @param Y
	 *            - la case d'une colonne fait partie du plateau
	 * @return true si une case d'une ligne et d'une colonne sont sur l'espace
	 *         plateau délimité
	 */
	public boolean delimitationPlateau(int X, int Y) {
		return ((X >= 0) && (X < ligne) && (Y >= 0) && (Y < colonne));

	}

	/**
	 * Place un bateau
	 */
	public void bateauPlace(Bateaux bateaux, int c, int l, Orientation orientation)
			throws PositionInvalideException, HorsPlateauException {
		int horizontal = orientation.horizontal();
		int vertical = orientation.vertical();
		List<Integer> place = new ArrayList<Integer>();

		/** Conditions pour placer un bâteau */
		int i;
		if (grille[l][c] != caseVide) {
			throw new PositionInvalideException("La position est déjà occupée par un autre navire");
		}

		for (i = 0; i < bateaux.taille; i++) {
			if (!delimitationPlateau(l + (horizontal * i), c + (vertical * i))) {
				throw new HorsPlateauException("Le bateau est en dehors du plateau");
			}
			if (grille[l + (horizontal * i)][c + (vertical * i)] != caseVide) {
				throw new PositionInvalideException("Un bâteau peut déjà être sur cette case");
			}
			place.add(i);
		}
		for (i = 0; i < bateaux.getTaille(); i++) {
			grille[l + (horizontal * place.get(i))][c + (vertical * place.get(i))] = bateaux.bId;
		}

	}

	public void afficherPlateau() {
		for (int i = 1; i < ligne; i++) {
			for (int j = 1; j < colonne; j++) {
				System.out.print(grille[j][i]);
			}
			System.out.print("\n");

		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(ligne * (colonne + 1));
		for (int i = 1; i < ligne; i++) {
			for (int j = 1; j < colonne; j++) {
				builder.append(grille[j][i]);
			}
			builder.append("\n");
		}
		return builder.toString();

	}

	public boolean estTouche(int X, int Y, Plateau afficherBateau) throws CaseToucheeException {

		if (afficherBateau.grille[X][Y] == caseRatee) {
			throw new CaseToucheeException("Vous avez déjà tirez sur cette position!");
		}
		if (grille[X][Y] == caseVide) {
			afficherBateau.grille[X][Y] = caseRatee;
		}
		if (grille[X][Y] != caseVide) {
			grille[X][Y] = caseTouche;
			afficherBateau.grille[X][Y] = caseTouche;
			return true;
		}
		return false;
	}

	public boolean checkVictory() {
		for (int i = 0; i < ligne; i++) {
			for (int j = 0; j < colonne; j++) {
				if (grille[i][j] != caseVide) {
					if (grille[i][j] != caseTouche) {
						return false;
					}
				}
			}
		}
		return true;

	}
}
