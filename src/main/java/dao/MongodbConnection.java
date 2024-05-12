package dao;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.MongoException;
 
public class MongodbConnection {
	
	    private static final String MONGODB_URI = "mongodb://localhost:27017";
	    private static MongoClient mongoClient;

	    private MongodbConnection() {
	    }

	    public static synchronized MongoClient getMongoClient() {
	        if (mongoClient == null) {
	            try {
	            	System.out.println("Connecte a Mongodb");
	                mongoClient = MongoClients.create(MONGODB_URI);
	            } catch (MongoException e) {
	                e.printStackTrace();
	            }
	        }
	        return mongoClient;
	    }
}
