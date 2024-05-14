package dao;

import java.util.List;

import beans.Documentb;

public interface DocumentDao {
	public void insertDocument(Documentb document);
	public List<Documentb> selectDocumentByAuteur(String Auteur);
	public List<Documentb> selectDocumentByGenre(String genre);
	public List<Documentb> selectDocumentByTitre(String titre);
	public List<Documentb> selectDocumentByCode(int code);
	public List<Documentb> selectDocumentByVersion(int version);
	public List<Documentb> selectDocumentByVisibilite(String visibilite);
	public List<Documentb> selectAllDocuments();
	public void updateDocument(Documentb document);
	public void deleteDocumentByEmail(String email);
}
