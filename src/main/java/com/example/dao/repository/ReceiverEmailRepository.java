package com.example.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.dao.entity.ReceiverEmail;

public interface ReceiverEmailRepository extends CrudRepository<ReceiverEmail, Integer> {

	@Query("select re.receiverId from ReceiverEmail re where re.messageId = :messageId")
	List<String> getReceiversEmail(@Param("messageId") String messageId);

}