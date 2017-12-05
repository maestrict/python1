package controller;

import java.util.Scanner;

import model.Orientation;

public class AskValues {
	/**
	 * Permet de forcer les joueurs à rentrer de bonnes coordonée (integer)
	 * http://stackoverflow.com/questions/13115266/how-to-insist-that-a-users-input-is-an-int
	 * 
	 * @param message
	 * @return
	 */
	
	public static int verifInt(String message){
		Scanner scan = new Scanner(System.in);
		int valeur=-1;

		while(valeur<0 || valeur>10){
			System.out.println(message);

			try{
				valeur=scan.nextInt();
			}
			catch(java.util.InputMismatchException e){
				System.err.println("Veuillez entrer un chiffre");
				scan.nextLine();
			}
		}
		return valeur;

	}
	
	public static String choixOrientation(){
		String orientation;
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("Choisir orientation du bateau(haut, bas, gauche, droite) :");
			try{
				orientation = scan.nextLine();
				orientation = orientation.toUpperCase(); //Permet de choisir l'orientation en full tard caps lock 
				Orientation.valueOf(orientation);
			}
			catch(java.lang.IllegalArgumentException e){
				System.err.print("Ceci n'est pas une orientation correct!");
				continue;
			}
			if(Orientation.valueOf(orientation)==Orientation.HAUT || Orientation.valueOf(orientation)==Orientation.BAS || Orientation.valueOf(orientation)==Orientation.GAUCHE || Orientation.valueOf(orientation)==Orientation.DROITE){
				break;
			}
		}
		return orientation;
	}

}
