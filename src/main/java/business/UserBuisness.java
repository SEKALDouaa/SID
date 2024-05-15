package business;

import java.util.List;

import beans.User;

public interface UserBuisness {
	public void addUser(User user);
	public User getUserById(int id);
	public User getUserByEmail(String email);
	public User getUserByDepartement(String departement);
	public List<User> getAllUsers();
	public void updateUser(User user);
	public void deleteUserByEmail(String email);
	public boolean determineExistant(User user);
}
