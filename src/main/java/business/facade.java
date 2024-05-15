package business;

import java.util.List;

import beans.Documentb;
import beans.User;

public class facade {
	private UserBuisness ub;
	private DocumentBuisness db;
	
	//Business user methods
	public void addUser(User user) {
		ub.addUser(user);
	}
	
	public User getUserById(int id) {
		return ub.getUserById(id);
	}
	
	public User getUserByEmail(String email) {
		return ub.getUserByEmail(email);
	}
	
	public User getUserByDepartement(String departement) {
		return ub.getUserByDepartement(departement);
	}
	
	public List<User> getAllUsers(){
		return ub.getAllUsers();
	}
	
	public void updateUser(User user) {
		ub.updateUser(user);
	}
	
	public void deleteUserByEmail(String email) {
		ub.deleteUserByEmail(email);
	}
	
	public boolean determineExistant(User user) {
		return ub.determineExistant(user);
	}
	
	//Business document methods
	
	public void addDocument(Documentb document) {
		db.addDocument(document);
	}
	
	public List<Documentb> getDocumentByAuteur(String Auteur){
		return db.getDocumentByAuteur(Auteur);
	}
	
	public List<Documentb> getDocumentByGenre(String genre){
		return db.getDocumentByGenre(genre);
	}
	
	public List<Documentb> getDocumentByTitre(String titre){
		return db.getDocumentByTitre(titre);
	}
	
	public List<Documentb> getDocumentByCode(int code){
		return db.getDocumentByCode(code);
	}
	
	public List<Documentb> getDocumentByVersion(int version){
		return db.getDocumentByVersion(version);
	}
	
	public List<Documentb> getDocumentByVisibilite(String visibilite){
		return db.getDocumentByVisibilite(visibilite);
	}
	
	public List<Documentb> getDocumentByDepartement(String departement){
		return db.getDocumentByDepartement(departement);
	}
	
	public List<Documentb> getAllDocuments(){
		return db.getAllDocuments();
	}
	
	public List<Documentb> getLatestVersions(){
		return db.getLatestVersions();
	}
	
	public List<Documentb> getLatestVersionsDept(String dept){
		return db.getLatestVersionsDept(dept);
	}
	
	public List<Documentb> getDocContainingString(String titre){
		return db.getDocContainingString(titre);
	}
	
	public List<Documentb> getDocContainingStringDept(String titre,String dept){
		return db.getDocContainingStringDept(titre, dept);
	}
	
	public List<Documentb> getDocContainingStringDeptV(String titre,String dept){
		return db.getDocContainingStringDeptV(titre, dept);
	}
	
	public void updateDocument(Documentb document) {
		db.updateDocument(document);
	}
	
	public void deleteDocumentByCode(int code) {
		db.deleteDocumentByCode(code);
	}
}
