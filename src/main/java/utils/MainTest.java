package utils;

import com.mongodb.client.MongoClient;

import beans.User;
import dao.MongodbConnection;
import dao.UserDao;
import dao.UserDaoImpl;

public class MainTest {


	public static void main(String[] args) {
		/*
		 //Tester la connection de la base
        MongoClient mongoClient = MongodbConnection.getMongoClient();
        for (String dbName : mongoClient.listDatabaseNames()) {
            System.out.println("Database: " + dbName);
        }
        mongoClient.close();*/
		
		//Tester CRUD pour user
		
		UserDao ud= new UserDaoImpl(MongodbConnection.getMongoClient());
		User user=new User("0","test@gmail.com","hbiihjko","test2","test2");
		//ud.insertUser(user);
		//User user2=ud.selectUserByEmail("test@gmail.com");
		//System.out.println(user2.toString());
		ud.updateUser(user);
    }

}
