package fr.isika.cdi9.spring.service;

import java.util.List;

import fr.isika.cdi9.spring.model.User;

public interface IUserservice {

	void sauverUser(User ryan);

	List<User> listerUsers();

	User getById(Long id);
}
