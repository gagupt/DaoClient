package com.example.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.dao.entity.UserEmail;

public interface UserEmailRepository extends CrudRepository<UserEmail, Integer> {

	@Query("select new UserEmail(ue.emailId,ue.messageId,ue.messageFolderType, ue.isRead) from UserEmail ue where ue.emailId = :emailId")
	List<UserEmail> getEmail(@Param("emailId") String emailId);

	@Query("select new UserEmail(ue.emailId,ue.messageId,ue.messageFolderType, ue.isRead) from UserEmail"
			+ " ue where ue.emailId = :emailId and ue.messageId = :messageId")
	UserEmail getUserEmail(@Param("emailId") String emailId, @Param("messageId") String messageId);

}