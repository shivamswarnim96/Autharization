package com.amdocs.media.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.media.controller.AuthorizarionException;
import com.amdocs.media.controller.UserResponse;
import com.amdocs.media.dao.AuthorizationDaoImp;
import com.amdocs.media.model.User;

@Service
public class AuthorizationServiceImp implements AuthorizationService{
		
	@Autowired
	AuthorizationDaoImp authorizationDaoImp;
	
	@Override
	public UserResponse getUser(String userName,String password) {
		User user = authorizationDaoImp.getUser(userName);
		UserResponse userResponse = new UserResponse();
		if(user.getPassword().equals(password)) {
			userResponse.setName(user.getName());
			userResponse.setPassword(user.getPassword());
			return userResponse;
		}else {
			throw new AuthorizarionException("Notfound" + userName);
		}
		
	}

}
