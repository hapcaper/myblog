package com.personal.service.serviceimpl;

import com.personal.dao.UserDao;
import com.personal.entity.User;
import com.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	private UserDao userDao;
	
	public User findUserByName(String username) {
		// TODO Auto-generated method stub
		return userDao.findUserByName(username);
	}

	

	

	
	
}
