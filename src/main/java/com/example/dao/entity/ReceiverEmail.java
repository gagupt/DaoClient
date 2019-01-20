package com.example.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.example.dao.model.ReceiverIdMessageId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "`ReceiverEmail`")
@IdClass(ReceiverIdMessageId.class)
public class ReceiverEmail {
	@Id
	private String receiverId;
	@Id
	private String messageId;
}
