package hibernate.service.impl;

import hibernate.dao.UserDao;
import hibernate.model.User;
import hibernate.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	@Transactional
	public void addUser(User user)
	{
		userDao.addUser(user);
	}

	@Override
	@Transactional
	public List<User> listUsers() 
	{
		return userDao.listUsers();
	}

	@Override
	@Transactional
	public User getUserById(long userId) 
	{
		return userDao.getUserById(userId);
	}

	@Override
	@Transactional
	public void deleteUser(long id) 
	{
		userDao.deleteUser(id);
		
	}

	@Override
	@Transactional
	public int updateUser(User user) 
	{
		return userDao.updateUser(user);
	}

}
