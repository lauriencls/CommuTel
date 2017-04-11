package controller;
import java.util.Scanner;

import model.*;
import view.Affichage;


public class Controleur {
	
	private static PosteAbonne mPosteAbonneCourant;
	private static Communication mCommunicationCourante;
	private static Commutateur mCommutateur;
	private static Affichage mAffichage;
	private static Scanner mReader; 						
	

	public static void main(String[] args) {

		mCommutateur = new Commutateur();
		mAffichage = new Affichage();
		
		
		
	}

	
	public void gererInteractionUtilisateur() {
		
		String choixUtilisateur;
		int continuer = 1;
		
		while(continuer != 0) {
			mAffichage.afficherMenu();
			choixUtilisateur = mReader.nextLine().substring(0,1);
			continuer = Integer.parseInt(choixUtilisateur);
		}
	}
}
