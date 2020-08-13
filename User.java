package com.amdocs.media.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
    @Id
    @Column
    private String name;

    @Column
    private String password;
 
    public User(){

    }

    public User(User user) {
        this.name = user.getName();
        this.password = user.getPassword();
        
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
		return "User [name=" + name + ", password=" + password + "]";
	}
    
}