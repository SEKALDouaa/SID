package beans;

public class Documentb {
	private int code;
	private String Auteur;
	private String genre; //livre, article, cours...
	private String dateCreation;
	private String dateModification;
	private int version;
	private String content;
	
	public Documentb() {
	}

	

	public Documentb(int code, String auteur, String genre, String dateCreation, String dateModification,
			int version, String content) {
		this.code = code;
		Auteur = auteur;
		this.genre = genre;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.version = version;
		this.content = content;
	}



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}



	public String toString() {
		return "Documentb [code=" + code + ", Auteur=" + Auteur + ", genre=" + genre + ", dateCreation=" + dateCreation
				+ ", dateModification=" + dateModification + ", version=" + version + ", content=" + content + "]";
	}
	
}
