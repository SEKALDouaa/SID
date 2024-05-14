package dao;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import beans.User;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

public class UserDaoImpl implements UserDao {
    private MongoCollection<Document> userCollection;
    private MongoDatabase database;

    public UserDaoImpl(MongoClient mongoClient) {
        database = mongoClient.getDatabase("SID");
        userCollection = database.getCollection("User");
    }

    public void insertUser(User user) {
        Document userDocument = new Document()
        		.append("id", user.getId())
                .append("email", user.getEmail())
                .append("password", user.getPassword())
                .append("department", user.getDepartement())
                .append("type", user.getType());

        userCollection.insertOne(userDocument);
    }
    
	public User selectUserById(int id) {
		Document query = new Document("id", id);
        Document userDocument = userCollection.find(query).first();

        if (userDocument != null) {
            return new User(
                    userDocument.getInteger("id"),
                    userDocument.getString("email"),
                    userDocument.getString("password"),
                    userDocument.getString("department"),
                    userDocument.getString("type")
            );
        }
        return null;
	}

    public User selectUserByEmail(String email) {
        Document query = new Document("email", email);
        Document userDocument = userCollection.find(query).first();

        if (userDocument != null) {
            return new User(
                    userDocument.getInteger("id"),
                    userDocument.getString("email"),
                    userDocument.getString("password"),
                    userDocument.getString("department"),
                    userDocument.getString("type")
            );
        }
        return null;
    }

    public void updateUser(User user) {
        Document query = new Document("email", user.getEmail());
        Document update = new Document("$set", new Document()
                .append("password", user.getPassword())
                .append("department", user.getDepartement())
                .append("type", user.getType()));

        userCollection.updateOne(query, update);
    }

    public void deleteUserByEmail(String email) {
        Document query = new Document("email", email);
        userCollection.deleteOne(query);
    }

	public User selectUserByDepartement(String departement) {
		Document query = new Document("departement", departement);
        Document userDocument = userCollection.find(query).first();

        if (userDocument != null) {
            return new User(
                    userDocument.getInteger("id"),
                    userDocument.getString("email"),
                    userDocument.getString("password"),
                    userDocument.getString("department"),
                    userDocument.getString("type")
            );
        }
        return null;
	}

	public List<User> selectAllUsers() {
		MongoCursor<Document> cursor = userCollection.find().iterator();
	    try {
	    	List<User> l=new ArrayList<>();
	        while (cursor.hasNext()) {
	            Document userDocument = cursor.next();
	            
	            int id = userDocument.getInteger("id");
	            String email = userDocument.getString("email");
	            String password = userDocument.getString("password");
	            String department = userDocument.getString("department");
	            String type = userDocument.getString("type");
	            
	            l.add(new User(id,email,password,department,type));
	        }
	        return l;}finally {
	            cursor.close();
	        }
	    }

}
