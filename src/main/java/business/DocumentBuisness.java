package business;

import java.util.List;

import beans.Documentb;

public interface DocumentBuisness {
	public void addDocument(Documentb document);
	public List<Documentb> getDocumentByAuteur(String Auteur);
	public List<Documentb> getDocumentByGenre(String genre);
	public List<Documentb> getDocumentByTitre(String titre);
	public List<Documentb> getDocumentByCode(int code);
	public List<Documentb> getDocumentByVersion(int version);
	public List<Documentb> getDocumentByVisibilite(String visibilite);
	public List<Documentb> getDocumentByDepartement(String departement);
	public List<Documentb> getAllDocuments();
	public List<Documentb> getLatestVersions();
	public List<Documentb> getLatestVersionsDept(String dept);
	public List<Documentb> getDocContainingString(String titre); //concerne tous les documents(de tous les departements) et toutes les versions
	public List<Documentb> getDocContainingStringDept(String titre,String dept); //concerne toutes les versions d'un departement
	public List<Documentb> getDocContainingStringDeptV(String titre,String dept);//concerne les dernieres versions d'un departement
	public void updateDocument(Documentb document);
	public void deleteDocumentByCode(int code);
}
