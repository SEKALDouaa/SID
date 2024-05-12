package utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.client.MongoClient;

import dao.MongodbConnection;

public class MainTest {
    private static final Logger logger = LoggerFactory.getLogger(MainTest.class);


	public static void main(String[] args) {
        logger.info("Starting MongoDB connection...");

		  // Get the MongoDB client instance
        MongoClient mongoClient = MongodbConnection.getMongoClient();

        // Now you can use the `mongoClient` to interact with MongoDB
        // For example, list the database names:
        for (String dbName : mongoClient.listDatabaseNames()) {
            System.out.println("Database: " + dbName);
        }

        // Close the client when done (usually in a finally block)
        mongoClient.close();
    }

}
