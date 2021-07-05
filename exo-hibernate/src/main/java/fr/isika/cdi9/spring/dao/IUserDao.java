package fr.isika.cdi9.spring.dao;

import java.util.List;

import fr.isika.cdi9.spring.model.User;

public interface IUserDao {

	void sauver(User user);

	List<User> recupererTousUser();

	User getById(Long id);
}
