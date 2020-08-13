package com.amdocs.media.controller;

import org.springframework.stereotype.Component;

@Component
public class UserResponse {
	
	private String name;

    private String password;
 
    public UserResponse(){

    }

    public UserResponse(UserResponse userResponse) {
        this.name = userResponse.getName();
        this.password = userResponse.getPassword();
        
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
		return "UserResponse [name=" + name + ", password=" + password + "]";
	}
        
}
