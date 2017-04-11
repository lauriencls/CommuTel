package model;

import org.joda.time.DateTime;

public interface CommunicationInterface {

	public void creerMessage(String emetteur, String contenu, DateTime dateEmission);
	public void historiserCommunication();
}
