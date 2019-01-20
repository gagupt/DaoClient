package com.example.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.dao.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select new User(u.emailId,u.name,u.password) from User u where u.emailId = :emailId")
	User getUser(@Param("emailId") String emailId);

}