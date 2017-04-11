package controller;

public interface ControleurInterface {

	public void calculerTempsCommunication();
	public void creerCommunication();
	public void creerPosteAbonne();
	public void lireNomFichierPourHistorique();
	public void lireNomsFichiersPourHistorique();
	public void historiserCommunication();
	public void modifierPrenomPosteAbonne();
	public void modifierNomPosteAbonne();
	public void posteAbonneAppeler();
	public void posteAbonneDecrocher();
	public void posteAbonneEnCommunicationEmet();
	public void posteAbonneEstEnCommunication();
	public void posteAbonneMessageRecu();
	public void posteAbonnePossedeMessage();
	public void posteAbonneRaccrocher();
	public void supprimerPosteAbonne();
	
}
