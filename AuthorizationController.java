package com.amdocs.media.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.media.service.AuthorizationService;


@RestController
public class AuthorizationController {
	
	@Autowired
	AuthorizationService authorizationService;

	@RequestMapping(value = "/auth", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity authorizationUser(@RequestBody UserRequest userReq, HttpServletRequest request) {
		
		String userName=userReq.getName();
		String password=userReq.getPassword();
		UserResponse userResponse = new UserResponse();
		try {
			userResponse=authorizationService.getUser(userName,password);
		}catch (Exception e) {
			userResponse.setName("Not Fount in Database");
			userResponse.setPassword("Invalid Password");
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(userResponse);
		}
		if(userResponse.getName()==null) {
			userResponse.setName("Not Fount in Database");
			userResponse.setPassword("Invalid Password");
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(userResponse);//.body(userResponse);
		}
		return ResponseEntity.status(HttpStatus.OK).body(userResponse);
		
		
	}

}
