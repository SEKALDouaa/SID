package dao;

import java.util.List;

import beans.Documentb;

public interface DocumentDao {
	public void insertDocument(Documentb document);
	public Documentb selectDocumentByAuteur(String Auteur);
	public Documentb selectDocumentByGenre(String genre);
	public Documentb selectDocumentByVersion(int version);
	public List<Documentb> selectAllDocuments();
	public void updateDocument(Documentb document);
	public void deleteDocumentByEmail(String email);
}
