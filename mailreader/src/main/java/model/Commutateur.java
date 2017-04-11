package model;

import java.util.ArrayList;

public class Commutateur {
	
	private boolean mEstActif;
	private ArrayList<Communication> mListeCommunications;
	private ArrayList<PosteAbonne> mListePostesAbonnes;
	
	public Commutateur() {
		super();
		this.mEstActif = false;
		this.mListeCommunications = new ArrayList<Communication>();
		this.mListePostesAbonnes = new ArrayList<PosteAbonne>();

	}

	public boolean ismEstActif() {
		return mEstActif;
	}

	public void setmEstActif(boolean mEstActif) {
		this.mEstActif = mEstActif;
	}

	public ArrayList<Communication> getmListeCommunications() {
		return mListeCommunications;
	}

	public void setmListeCommunications(ArrayList<Communication> mListeCommunications) {
		this.mListeCommunications = mListeCommunications;
	}

	public ArrayList<PosteAbonne> getmListePostesAbonnes() {
		return mListePostesAbonnes;
	}

	public void setmListePostesAbonnes(ArrayList<PosteAbonne> mListePostesAbonnes) {
		this.mListePostesAbonnes = mListePostesAbonnes;
	}
	
	



}
