package dao;

import java.util.List;

import beans.User;

public interface UserDao {
	public void insertUser(User user);
	public User selectUserById(int id);
	public User selectUserByEmail(String email);
	public User selectUserByDepartement(String departement);
	public List<User> selectAllUsers();
	public void updateUser(User user);
	public void deleteUserByEmail(String email);
}
