package model;

import org.joda.time.DateTime;

public class Message {
	
	private String mEmetteur;
	private String mContenu;
	private DateTime mDateEmission;
	
	public Message(String mEmetteur, String mContenu, DateTime mDateEmission) {
		super();
		this.mEmetteur = mEmetteur;
		this.mContenu = mContenu;
		this.mDateEmission = mDateEmission;
	}

	public String getmEmetteur() {
		return mEmetteur;
	}

	public void setmEmetteur(String mEmetteur) {
		this.mEmetteur = mEmetteur;
	}

	public String getmContenu() {
		return mContenu;
	}

	public void setmContenu(String mContenu) {
		this.mContenu = mContenu;
	}

	public DateTime getmDateEmission() {
		return mDateEmission;
	}

	public void setmDateEmission(DateTime mDateEmission) {
		this.mDateEmission = mDateEmission;
	}
	
	
	
	

}
