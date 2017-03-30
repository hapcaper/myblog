package com.personal.dao;

import com.personal.entity.User;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao {
	
	
	public User findUserByName(String username);



}
