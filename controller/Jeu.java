/**
 * 
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.CaseToucheeException;
import exception.HorsPlateauException;
import exception.PositionInvalideException;
import model.Bateaux;
import model.Croiseur;
import model.Destructeur;
import model.Joueur;
import model.Orientation;
import model.Plateau;
import model.PorteAvion;
import model.SousMarin;
import model.Torpilleur;
/**
 * @author Chris
 *
 */
public class Jeu {
	

	private Joueur joueur1;
	private Joueur joueur2;
	private Plateau tirJ1;
	private Plateau tirJ2;
	private Plateau positionJ1;
	private Plateau positionJ2;
	int toursJoues;

	public Jeu(String nomJ1, String nomJ2){
		joueur1 = new Joueur(nomJ1);
		joueur2 = new Joueur(nomJ2);
		tirJ1 = new Plateau();
		tirJ2 = new Plateau();
		positionJ1 = new Plateau();
		positionJ2 = new Plateau();
		toursJoues = 0;
	}

	public void run(){
		List<Bateaux> bateauxJ1 = new ArrayList<Bateaux>();
		bateauxJ1.add(new Croiseur());
		bateauxJ1.add(new Destructeur());
		bateauxJ1.add(new PorteAvion());
		bateauxJ1.add(new Torpilleur());
		bateauxJ1.add(new SousMarin());

		List<Bateaux> bateauxJ2 = new ArrayList<Bateaux>();
		bateauxJ2.add(new Croiseur());
		bateauxJ2.add(new Destructeur());
		bateauxJ2.add(new PorteAvion());
		bateauxJ2.add(new Torpilleur());
		bateauxJ2.add(new SousMarin());

		placementDeBateau(bateauxJ1, positionJ1, joueur1);
		placementDeBateau(bateauxJ2, positionJ2, joueur2);


		System.out.println(" ");
		System.out.println("La bataille va commencer");
		System.out.println(" ");

		String joueurActif;
		while(true){
			joueurActif=attaque(positionJ2, tirJ1, joueur1);
			joueurActif=attaque(positionJ1, tirJ2, joueur2);
		}


	}


	public void placementDeBateau(List<Bateaux> navires, Plateau position, Joueur joueur){
		int X=0;
		int Y=0;
		String orientation;

		/**
		 * Demande aux joueurs de placer leur bateaux
		 * @param X demande une coordonnée entre 1 et 10 (ligne)
		 * @pram Y demande une coordonnée entre 1 et 10 (colonne)
		 */

		System.out.printf("%s, veuillez placer un bateau", joueur.getNom());
		System.out.println(" ");

		for(Bateaux bateaux : navires){
			System.out.printf("Bateau séléctionné: %s. -- Taille: %s", bateaux.getNomBateau(), +bateaux.getTaille());
			System.out.println(" ");
			while(true){
				X=controller.AskValues.verifInt("Indiquez la coordonnée horizontale(ligne): ");
				Y=controller.AskValues.verifInt("Indiquez la coordonnée verticale(colonne): ");
				orientation=controller.AskValues.choixOrientation();

				try{
					position.bateauPlace(bateaux, X, Y, Orientation.valueOf(orientation));
					System.out.println(position);
					break;
				}
				catch(HorsPlateauException e1){
					System.err.println(e1.getMessage());
					System.out.println("Réessayez!");
					System.out.println(position);
					continue;
				}
				catch(PositionInvalideException e1){
					System.err.println(e1.getMessage());
					System.out.println("Réessayez!");
					System.out.println(position);
					continue;

				}
			}
		}


	}

	public String attaque(Plateau tir, Plateau position, Joueur joueur){
		String aTouche;
		while(true){
			int X = 0;
			int Y = 0;
			System.out.println(" ");
			System.out.printf("C'est à vous, %s !", joueur.getNom());
			System.out.println(" ");

			X=controller.AskValues.verifInt("Attaquez cette ligne!");
			Y=controller.AskValues.verifInt("Attaquez cette colonne!");

			try{
				aTouche = touche(tir.estTouche(X, Y, position));
				System.out.println(position);
				toursJoues++;
				Bateaux.vieBateau--;
				break;
			}
			catch (CaseToucheeException e){
				System.err.println(e.getMessage());
			}
		}
		System.out.println(aTouche);
		return joueur.getNom();
	}
	
	

	public String touche(boolean aTouche){
		if (aTouche){
			return "Touché capitaine!";
		}
		else{
			return "Raté capitaine!";
		}
	}
	
	
	/**
	 * Si le compteur de vie du bâteau est à 0, le bâteau est considé comme coulé
	 * 
	 * 
	 */

	public void coule(Bateaux bateaux){
		while(Torpilleur.vieBateau==0){
			System.out.printf("%s a coulé!", Torpilleur.getNomBateau());
		}
		while(SousMarin.vieBateau==0){
			System.out.printf("%s a coulé!", SousMarin.getNomBateau());
		}
			
		while(PorteAvion.vieBateau==0){
				System.out.printf("%s a coulé!", PorteAvion.getNomBateau());
		}
		while(Destructeur.vieBateau==0){
			System.out.printf("%s a coulé!", Destructeur.getNomBateau());
		}
		while(Croiseur.vieBateau==0){
			System.out.printf("%s a coulé!", Croiseur.getNomBateau());
		}
				
	}
}








