package com.amdocs.media.controller;

import org.springframework.stereotype.Component;

@Component
public class UserRequest {
	
	private String name;

    private String password;
 
    public UserRequest(){

    }

    public UserRequest(UserRequest userRequest) {
        this.name = userRequest.getName();
        this.password = userRequest.getPassword();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	@Override
	public String toString() {
		return "UserRequest [name=" + name + ", password=" + password + "]";
	}

}
