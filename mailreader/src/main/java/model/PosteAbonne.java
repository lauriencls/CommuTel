package model;

public class PosteAbonne {
	
	private String mNom;
	private String mPrenom;
	private String mNumTel;
	private boolean mEstDecroche;


	public PosteAbonne(String mNom, String mPrenom, String mNumTel) {
		super();
		this.mNom = mNom;
		this.mPrenom = mPrenom;
		this.mNumTel = mNumTel;
		this.mEstDecroche = false;
	}


	public String getmNom() {
		return mNom;
	}


	public void setmNom(String mNom) {
		this.mNom = mNom;
	}


	public String getmPrenom() {
		return mPrenom;
	}


	public void setmPrenom(String mPrenom) {
		this.mPrenom = mPrenom;
	}


	public String getmNumTel() {
		return mNumTel;
	}


	public void setmNumTel(String mNumTel) {
		this.mNumTel = mNumTel;
	}


	public boolean ismEstDecroche() {
		return mEstDecroche;
	}


	public void setmEstDecroche(boolean mEstDecroche) {
		this.mEstDecroche = mEstDecroche;
	}
	
	

}
