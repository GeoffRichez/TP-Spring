package fr.isika.cdi9.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.isika.cdi9.spring.dao.UserDaoImpl;
import fr.isika.cdi9.spring.model.User;

@Service("userService")
public class UserServiceImpl implements IUserservice {

	@Autowired
	private UserDaoImpl dao;

	@Override
	@Transactional
	public void sauverUser(User ryan) {
		dao.sauver(ryan);
	}

	@Override
	@Transactional
	public List<User> listerUsers() {
		List<User> result = dao.recupererTousUser();
		for (User user : result) {
			System.out.println(user.getName() + " " + user.getEmail());
		}
		return result;
	}

	@Override
	@Transactional
	public User getById(Long id) {
		User userFound = dao.getById(id);
		return userFound;
	}

}
