package com.example.dao.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.dao.entity.Email;

public interface EmailRepository extends CrudRepository<Email, Integer> {

	@Query("select new Email(e.messageId,e.parentMessageId,e.senderEmailId,e.body,e.attachmentUrl,e.messageType) "
			+ "from Email e where e.messageId = :messageId")
	Email getEmail(@Param("messageId") String messageId);

}