package com.amdocs.media.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amdocs.media.model.User;

public interface AuthorizationDao extends JpaRepository<User, String>{

}
