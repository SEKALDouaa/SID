package beans;

import java.time.LocalDate;

public class Documentb {
	private int code;
	private String titre;
	private String departement;
	private String auteur;
	private String genre; //livre, article, cours...
	private String dateCreation;
	private String dateModification;
	private int version;
	private String visibilite; //soit tout le monde soit juste le departement du document
	private String content;
	
	public Documentb() {
	}
	
	public Documentb(String titre, String departement, String auteur, String genre,
			  String visibilite, String content) {
		this.code=-1;
		this.titre = titre;
		this.departement = departement;
		this.auteur = auteur;
		this.genre = genre;
		this.dateCreation = ""+LocalDate.now();
		this.dateModification = "--";
		this.version = 1;
		this.visibilite = visibilite;
		this.content = content;
	}

	public Documentb(int code, String titre, String departement, String auteur, String genre, String dateCreation,
			String dateModification, int version, String visibilite, String content) {
		this.code = code;
		this.titre = titre;
		this.departement = departement;
		this.auteur = auteur;
		this.genre = genre;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.version = version;
		this.visibilite = visibilite;
		this.content = content;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDepartement() {
		return departement;
	}



	public void setDepartement(String departement) {
		this.departement = departement;
	}



	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateModification() {
		return dateModification;
	}

	public void setDateModification(String dateModification) {
		this.dateModification = dateModification;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	public String getVisibilite() {
		return visibilite;
	}

	public void setVisibilite(String visibilite) {
		this.visibilite = visibilite;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String toString() {
		return "Documentb [code=" + code + ", titre=" + titre + ", departement=" + departement + ", auteur=" + auteur
				+ ", genre=" + genre + ", dateCreation=" + dateCreation + ", dateModification=" + dateModification
				+ ", version=" + version + ", visibilite=" + visibilite + ", content=" + content + "]";
	}

}
