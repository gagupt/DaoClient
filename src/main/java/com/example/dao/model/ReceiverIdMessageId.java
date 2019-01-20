package com.example.dao.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReceiverIdMessageId implements Serializable {
	private String receiverId;
	private String messageId;
}
