package business;

import java.util.List;

import beans.User;
import dao.UserDaoImpl;

public class UserManager implements UserBuisness{
	private UserDaoImpl usr; 
	
	public UserManager() {
	}

	public UserManager(UserDaoImpl usr) {
		this.usr = usr;
	}
	public boolean determineExistant(User user) {
		if(usr.selectUserById(user.getId())== null){
			return false;
		}
		else if(usr.selectUserById(user.getId()).getEmail().equals(user.getEmail()) && usr.selectUserById(user.getId()).getPassword().equals(user.getPassword())) {
			return true;
		}
		return false;
	}

	public void addUser(User user) {
		usr.insertUser(user);
	}

	public User getUserById(int id) {
		return usr.selectUserById(id);
	}

	public User getUserByEmail(String email) {
		return usr.selectUserByEmail(email);
	}

	public User getUserByDepartement(String departement) {
		return usr.selectUserByDepartement(departement);
	}

	public List<User> getAllUsers() {
		return usr.selectAllUsers();
	}

	public void updateUser(User user) {
		usr.updateUser(user);
	}

	public void deleteUserByEmail(String email) {
		usr.deleteUserByEmail(email);
	}
}
