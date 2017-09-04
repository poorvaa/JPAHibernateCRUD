package hibernate.dao.impl;

import hibernate.dao.UserDao;
import hibernate.model.User;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {
	
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void addUser(User user) {
		em.persist(user);

	}

	@Override
	public List<User> listUsers() {
		
		String userQuery = "Select u from User u ";
		TypedQuery<User> query = em.createQuery(userQuery,User.class);
		return query.getResultList();
	}
	
	

	@Override
	public User getUserById(long userId) {
	
		try
		{
		String userQuery = "Select u from User u where u.userId = ?1";
		TypedQuery<User> query = em.createQuery(userQuery,User.class);
		query.setParameter(1,userId);
		return query.getSingleResult();
		}
		
	 catch (NoResultException e) 
	 {
		return null;
	 }
		
	}
	
	
	@Override
	public int updateUser(User user) {

		em.merge(user);
		return 1;

	}
	

	@Override
	public void deleteUser(long id) {

		User user = em.find(User.class, 1);
		em.remove(user);

	}
	
	
	

}
