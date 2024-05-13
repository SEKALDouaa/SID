package dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.FindIterable;
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
				.append("code",document.getCode())
				.append("titre", document.getTitre())
				.append("departement", document.getDepartement())
                .append("auteur", document.getAuteur())
                .append("genre", document.getGenre())
                .append("dateCreation", document.getDateCreation())
                .append("dateModification", document.getDateModification())
                .append("version",document.getVersion())
                .append("content", document.getContent());

        documentCollection.insertOne(DocumentDocument);		
	}

	public List<Documentb> selectDocumentByAuteur(String auteur) {
		List<Documentb> l = new ArrayList<>();
		
		Document query = new Document("auteur", auteur);
        FindIterable<Document> DocumentDocument = documentCollection.find(query);

        for (Document document : DocumentDocument) {
             Documentb d= new Documentb(
            		 document.getInteger("code"),
            		 document.getString("titre"),
            		 document.getString("departement"),
            		 document.getString("auteur"),
            		 document.getString("genre"),
            		 document.getString("dateCreation"),
            		 document.getString("dateModification"),
            		 document.getInteger("version"),
            		 document.getString("content")
            );
             l.add(d);
        }
        return l;
	}

	public List<Documentb> selectDocumentByGenre(String genre) {
		List<Documentb> l = new ArrayList<>();
		
		Document query = new Document("genre", genre);
        FindIterable<Document> DocumentDocument = documentCollection.find(query);

        for (Document document : DocumentDocument) {
            Documentb d= new Documentb(
           		 document.getInteger("code"),
           		 document.getString("titre"),
           		 document.getString("departement"),
           		 document.getString("auteur"),
           		 document.getString("genre"),
           		 document.getString("dateCreation"),
           		 document.getString("dateModification"),
           		 document.getInteger("version"),
           		 document.getString("content")
           );
            l.add(d);
       }
       return l;
	}

	public List<Documentb> selectDocumentByVersion(int version) {
		List<Documentb> l = new ArrayList<>();
		
		Document query = new Document("version", version);
        FindIterable<Document> DocumentDocument = documentCollection.find(query);

        for (Document document : DocumentDocument) {
            Documentb d= new Documentb(
           		 document.getInteger("code"),
           		 document.getString("titre"),
           		 document.getString("departement"),
           		 document.getString("auteur"),
           		 document.getString("genre"),
           		 document.getString("dateCreation"),
           		 document.getString("dateModification"),
           		 document.getInteger("version"),
           		 document.getString("content")
           );
            l.add(d);
       }
       return l;
	}
	
	public List<Documentb> selectAllDocuments() {
		MongoCursor<Document> cursor = documentCollection.find().iterator();
	    try {
	    	List<Documentb> l=new ArrayList<>();
	        while (cursor.hasNext()) {
	            Document DocumentDocument = cursor.next();
	            
	            int code = DocumentDocument.getInteger("code");
	            String titre = DocumentDocument.getString("titre");
	            String departement = DocumentDocument.getString("departement");
	            String auteur = DocumentDocument.getString("auteur");
	            String genre = DocumentDocument.getString("genre");
	            String dateCreation = DocumentDocument.getString("dateCreation");
	            String dateModification = DocumentDocument.getString("dateModification");
	            int version = DocumentDocument.getInteger("version");
	            String content = DocumentDocument.getString("content");
	            
	            l.add(new Documentb(code,titre,departement,auteur,genre,dateCreation,dateModification,version,content));
	        }
	        return l;}finally {
	            cursor.close();
	        }
	}

	public void updateDocument(Documentb document) {
		Document query = new Document("code", document.getCode());
        Document update = new Document("$set", new Document()
                .append("auteur", document.getAuteur())
                .append("genre", document.getGenre())
        		.append("dateModification", document.getDateModification())
                .append("version", document.getVersion()))
        		.append("content", document.getContent());

        documentCollection.updateOne(query, update);
		
	}

	public void deleteDocumentByEmail(String code) {
		Document query = new Document("code", code);
        documentCollection.deleteOne(query);
		
	}

	public List<Documentb> selectDocumentByTitre(String titre) {
		List<Documentb> l = new ArrayList<>();
		
		Document query = new Document("titre", titre);
        FindIterable<Document> DocumentDocument = documentCollection.find(query);

        for (Document document : DocumentDocument) {
            Documentb d= new Documentb(
           		 document.getInteger("code"),
           		 document.getString("titre"),
           		 document.getString("departement"),
           		 document.getString("auteur"),
           		 document.getString("genre"),
           		 document.getString("dateCreation"),
           		 document.getString("dateModification"),
           		 document.getInteger("version"),
           		 document.getString("content")
           );
            l.add(d);
       }
       return l;
	}

	public List<Documentb> selectDocumentByCode(int code) {
		List<Documentb> l = new ArrayList<>();
		
		Document query = new Document("code", code);
        FindIterable<Document> DocumentDocument = documentCollection.find(query);

        for (Document document : DocumentDocument) {
            Documentb d= new Documentb(
           		 document.getInteger("code"),
           		 document.getString("titre"),
           		 document.getString("departement"),
           		 document.getString("auteur"),
           		 document.getString("genre"),
           		 document.getString("dateCreation"),
           		 document.getString("dateModification"),
           		 document.getInteger("version"),
           		 document.getString("content")
           );
            l.add(d);
       }
       return l;
	}

}
