package com.amdocs.media.service;

import com.amdocs.media.controller.UserResponse;

public interface AuthorizationService {
	
	public UserResponse getUser(String userName, String password);

}
