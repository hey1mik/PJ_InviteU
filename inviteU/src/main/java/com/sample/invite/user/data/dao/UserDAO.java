package com.sample.invite.user.data.dao;

import com.sample.invite.user.data.entity.User;

public interface UserDAO {
	
	User insertUser(User user);
	User selectUser(String id);
	User updateUser(User user);
	User deleteUser(User user);
}
