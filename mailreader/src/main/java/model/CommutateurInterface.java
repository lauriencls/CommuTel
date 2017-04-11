package model;

import org.joda.time.DateTime;

public interface CommutateurInterface {

	public void calculerTempsCommunication(Communication communication);
	public void creerCommunication(DateTime dateDebut, DateTime dateFin, String appelant, String appele);
	public void creerPosteAbonne(String nom, String prenom, String numTel);
	public void donneNombreCommunicationsEnCours();
	public void donneNombrePostesAbonnes();
	public void historiserCommunication(Communication communication);
	public void lireNomsFichiersPourHistorique();
	public void modifierNomPosteAbonne(PosteAbonne posteAbonne, String nom);
	public void modifierPrenomPosteAbonne(PosteAbonne posteAbonne, String prenom);
	public void posteAbonneAppeler(PosteAbonne posteAbonne, String numTel);
	public void posteAbonneDecrocher(PosteAbonne posteAbonne);
	public void posteAbonneEnCommunicationEmet(PosteAbonne posteAbonne, String message);
	public void posteAbonneEstEnCommunication(PosteAbonne posteAbonne);
	public void posteAbonneMessageRecu(PosteAbonne posteAbonne);
	public void posteAbonnePossedeMessage(PosteAbonne posteAbonne);
	public void posteAbonneRaccrocher(PosteAbonne posteAbonne);
	public void supprimerPosteAbonne(PosteAbonne posteAbonne);
	public void verifierDisponibilitePosteAbonne(PosteAbonne posteAbonne);
	public void verifierNumeroExistant(String numTel);
	
}
