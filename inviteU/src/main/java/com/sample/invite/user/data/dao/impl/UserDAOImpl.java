package com.sample.invite.user.data.dao.impl;

import org.springframework.stereotype.Component;

import com.sample.invite.user.data.dao.UserDAO;
import com.sample.invite.user.data.entity.User;
import com.sample.invite.user.data.repository.UserRepository;

@Component
public class UserDAOImpl implements UserDAO {
	
	private final UserRepository userRepository;
	
	public UserDAOImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public User insertUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public User selectUser(String id) {
		User selectedUser = userRepository.getById(id);
		return selectedUser;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
