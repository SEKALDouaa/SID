package beans;

public class User {
	private String id;
	private String email;
	private String password;
	private String departement;
	private String type; //directeur, chef de departement,...
	
	public User() {
	}

	public User(String id, String email, String password, String departement, String type) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.departement = departement;
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", departement=" + departement
				+ ", type=" + type + "]";
	}	
}
