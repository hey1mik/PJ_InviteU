package com.sample.invite.user.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.invite.user.data.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
