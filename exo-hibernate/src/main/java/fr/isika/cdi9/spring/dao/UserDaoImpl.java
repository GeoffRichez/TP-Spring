package fr.isika.cdi9.spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.isika.cdi9.spring.model.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void sauver(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public List<User> recupererTousUser() {
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User"); // equivaut à Select u
																								// from User u
		return query.getResultList();
	}

	@Override
	public User getById(Long id) {
		// TODO Auto-generated method stub
//		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User where USER_ID=id");
//		return query.getSingleResult();
		return sessionFactory.getCurrentSession().get(User.class, id);
	}

}
