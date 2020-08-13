package com.amdocs.media.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amdocs.media.model.User;

@Repository
public class AuthorizationDaoImp{
	
	
	@Autowired
	AuthorizationDao authorizationDao;
	
	public User getUser(String userName) {
		
		return authorizationDao.getOne(userName);
		
	}

}
