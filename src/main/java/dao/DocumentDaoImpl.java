package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import beans.Documentb;
import beans.User;

public class DocumentDaoImpl implements DocumentDao{
    private MongoCollection<org.bson.Document> documentCollection;
    private MongoDatabase database;
	
    public DocumentDaoImpl(MongoClient mongoClient) {
        database = mongoClient.getDatabase("SID");
        documentCollection = database.getCollection("Document");
    }

	public void insertDocument(Documentb document) {
		Document DocumentDocument = new Document()
                .append("Auteur", document.getAuteur())
                .append("genre", document.getGenre())
                .append("dateCreation", document.getDateCreation())
                .append("dateModification", document.getDateModification())
                .append("version",document.getVersion());

        documentCollection.insertOne(DocumentDocument);		
	}

	public Documentb selectDocumentByAuteur(String Auteur) {
		Document query = new Document("Auteur", Auteur);
        Document DocumentDocument = documentCollection.find(query).first();

        if (DocumentDocument != null) {
            return new Documentb(
            		DocumentDocument.getString("code"),
            		DocumentDocument.getString("Auteur"),
            		DocumentDocument.getString("genre"),
            		DocumentDocument.getString("dateCreation"),
            		DocumentDocument.getString("dateModification"),
            		DocumentDocument.getInteger("version")
            );
        }
        return null;
	}

	public Documentb selectDocumentByGenre(String genre) {
		Document query = new Document("genre", genre);
        Document DocumentDocument = documentCollection.find(query).first();

        if (DocumentDocument != null) {
            return new Documentb(
            		DocumentDocument.getString("code"),
            		DocumentDocument.getString("Auteur"),
            		DocumentDocument.getString("genre"),
            		DocumentDocument.getString("dateCreation"),
            		DocumentDocument.getString("dateModification"),
            		DocumentDocument.getInteger("version")
            );
        }
        return null;
	}

	public Documentb selectDocumentByVersion(int version) {
		Document query = new Document("version", version);
        Document DocumentDocument = documentCollection.find(query).first();

        if (DocumentDocument != null) {
            return new Documentb(
            		DocumentDocument.getString("code"),
            		DocumentDocument.getString("Auteur"),
            		DocumentDocument.getString("genre"),
            		DocumentDocument.getString("dateCreation"),
            		DocumentDocument.getString("dateModification"),
            		DocumentDocument.getInteger("version")
            );
        }
        return null;
	}
	@Override
	public List<Documentb> selectAllDocuments() {
		MongoCursor<Document> cursor = documentCollection.find().iterator();
	    try {
	    	List<Documentb> l=new ArrayList<>();
	        while (cursor.hasNext()) {
	            Document DocumentDocument = cursor.next();
	            
	            String code = DocumentDocument.getString("code");
	            String Auteur = DocumentDocument.getString("Auteur");
	            String genre = DocumentDocument.getString("genre");
	            String dateCreation = DocumentDocument.getString("dateCreation");
	            String dateModification = DocumentDocument.getString("dateModification");
	            int version = DocumentDocument.getInteger("version");
	            
	            l.add(new Documentb(code,Auteur,genre,dateCreation,dateModification,version));
	        }
	        return l;}finally {
	            cursor.close();
	        }
	}

	public void updateDocument(Documentb document) {
		Document query = new Document("code", document.getCode());
        Document update = new Document("$set", new Document()
                .append("Auteur", document.getAuteur())
                .append("genre", document.getGenre())
        		.append("dateModification", document.getDateModification())
                .append("version", document.getVersion()));

        documentCollection.updateOne(query, update);
		
	}

	public void deleteDocumentByEmail(String code) {
		Document query = new Document("code", code);
        documentCollection.deleteOne(query);
		
	}

}
