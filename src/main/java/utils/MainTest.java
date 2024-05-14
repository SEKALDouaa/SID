package utils;

import java.util.List;

import com.mongodb.client.MongoClient;

import beans.Documentb;
import beans.User;
import dao.DocumentDao;
import dao.DocumentDaoImpl;
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
		
		/*
		//User Tests
		UserDao ud= new UserDaoImpl(MongodbConnection.getMongoClient());
		User user=new User(0,"test@gmail.com","hbiihjko","test3","test3");
		ud.insertUser(user);
		User user2=ud.selectUserByEmail("test@gmail.com");
		System.out.println(user2.toString());
		ud.updateUser(user);
		ud.deleteUserByEmail("test@gmail.com");*/
		
		//Document Tests
		DocumentDao dd=new DocumentDaoImpl(MongodbConnection.getMongoClient());
		Documentb d=new Documentb(0,"test1","test1","test1","test1","test1","test1",1,"test1");
		Documentb d2=new Documentb(0,"test22","test22","test22","test22","test22","test22",1,"test22");
		Documentb d3=new Documentb(2,"test333","test333","test333","test333","test333","test333",2,"test333");
		//dd.insertDocument(d3);
		//dd.updateDocument(d3);
		List<Documentb> doc=dd.selectDocumentByCode(2);
		for(Documentb doc1 :doc) {
			System.out.println(doc1.toString());
		}
		
    }

}
