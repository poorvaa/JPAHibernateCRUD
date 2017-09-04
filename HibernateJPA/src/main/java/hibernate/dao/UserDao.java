package hibernate.dao;

import hibernate.model.User;

import java.util.List;

public interface UserDao {
	
	//create
	public void addUser(User user);
	//read
	public List<User> listUsers();
	//read single user
	public User getUserById(long userId);
	//delete
	public void deleteUser(long id);
	
	//update
	public int updateUser(User user);
	

}
