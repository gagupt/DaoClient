package com.example.dao.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.email.enums.MessageType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "`Email`")
public class Email {
	@Id
	private String messageId;
	private String parentMessageId;
	private String senderEmailId;
	private String body;
	private String attachmentUrl;
	@Enumerated(EnumType.STRING)
	private MessageType messageType;
}
