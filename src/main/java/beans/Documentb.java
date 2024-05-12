package beans;

public class Documentb {
	private String code;
	private String Auteur;
	private String genre; //livre, article, cours...
	private String dateCreation;
	private String dateModification;
	private int version;
	
	public Documentb() {
	}

	public Documentb(String code, String auteur, String genre, String dateCreation, String dateModification,
			int version) {
		this.code = code;
		Auteur = auteur;
		this.genre = genre;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
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

	public String toString() {
		return "Document [code=" + code + ", Auteur=" + Auteur + ", genre=" + genre + ", dateCreation=" + dateCreation
				+ ", dateModification=" + dateModification + ", version=" + version + "]";
	}
	
	
}
