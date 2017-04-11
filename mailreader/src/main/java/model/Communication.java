package model;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class Communication {
	
	private DateTime mDateDebut;
	private DateTime mDateFin;
	private String mAppelant;
	private String mAppele;
	private boolean mEnCours;
	private ArrayList<Message> mListeMessages;


	public Communication(DateTime mDateDebut, DateTime mDateFin, String mAppelant, String mAppele) {
		super();
		this.mDateDebut = mDateDebut;
		this.mDateFin = mDateFin;
		this.mAppelant = mAppelant;
		this.mAppele = mAppele;
		this.mEnCours = true;
		this.mListeMessages = new ArrayList<Message>();
	}


	public DateTime getmDateDebut() {
		return mDateDebut;
	}


	public void setmDateDebut(DateTime mDateDebut) {
		this.mDateDebut = mDateDebut;
	}


	public DateTime getmDateFin() {
		return mDateFin;
	}


	public void setmDateFin(DateTime mDateFin) {
		this.mDateFin = mDateFin;
	}


	public String getmAppelant() {
		return mAppelant;
	}


	public void setmAppelant(String mAppelant) {
		this.mAppelant = mAppelant;
	}


	public String getmAppele() {
		return mAppele;
	}


	public void setmAppele(String mAppele) {
		this.mAppele = mAppele;
	}


	public boolean ismEnCours() {
		return mEnCours;
	}


	public void setmEnCours(boolean mEnCours) {
		this.mEnCours = mEnCours;
	}


	public ArrayList<Message> getmListeMessages() {
		return mListeMessages;
	}


	public void setmListeMessages(ArrayList<Message> mListeMessages) {
		this.mListeMessages = mListeMessages;
	}
	
	
	
}
