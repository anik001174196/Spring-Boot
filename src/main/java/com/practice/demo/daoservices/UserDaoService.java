package com.practice.demo.daoservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.practice.demo.models.User;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 3;
	
	static {
		
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "John", new Date()));
		users.add(new User(3, "Disha", new Date()));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	
	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public User findOne(int id) {
		for (User user: users) {
			if (user.getId()==id)
				return user;
		}
		return null;
	}
	
}
