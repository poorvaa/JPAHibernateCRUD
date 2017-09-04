package hibernate.service;

import hibernate.model.User;

import java.util.List;

public interface UserService {
	
		public void addUser(User user);
		public List<User> listUsers();
		public User getUserById(long userId);
		public void deleteUser(long id);
		public int updateUser(User user);
	
	

}
