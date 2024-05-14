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
		
		
		/*//User Tests
		UserDao ud= new UserDaoImpl(MongodbConnection.getMongoClient());
		//User user=new User(1,"test@gmail.com","hbiihjko","test","test");
		//User user3=new User(2,"test@gmail.com","hbiihjko","dept 1","test");
		//ud.insertUser(user3);
		//User user2=ud.selectUserByEmail("test@gmail.com");
		//User user2=ud.selectUserById(1);
		User user2=ud.selectUserByDepartement("dept 1");
		System.out.println(user2.toString());
		//ud.updateUser(user);
		//ud.deleteUserByEmail("test@gmail.com");*/
		
		//Document Tests
		DocumentDao dd=new DocumentDaoImpl(MongodbConnection.getMongoClient());
		Documentb d=new Documentb(0,"title","department","auteur","genre","tout le monde","test updated");
		Documentb d2=new Documentb(2,"title2","department","auteur2","genre","departement","test test test");
		Documentb d3=new Documentb(3,"title3","department2","auteur","genre2","tout le monde","test test");
		//dd.insertDocument(d3);
		//dd.updateDocument(d);
		//List<Documentb> doc=dd.selectAllDocuments();
		dd.deleteDocumentByCode(0);
		/*for(Documentb doc1 :doc) {
			System.out.println(doc1.toString());
		}*/
		
    }

}
