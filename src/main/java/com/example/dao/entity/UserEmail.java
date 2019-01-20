package com.example.dao.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.example.dao.model.UserEmailId;
import com.example.email.enums.MessageFolderType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "`UserEmail`")
@IdClass(UserEmailId.class)
public class UserEmail {
	@Id
	private String emailId;
	@Id
	private String messageId;

	@Enumerated(EnumType.STRING)
	private MessageFolderType messageFolderType;
	private boolean isRead;
}
