package com.example.dao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.entity.Email;
import com.example.dao.entity.ReceiverEmail;
import com.example.dao.entity.UserEmail;
import com.example.dao.repository.EmailRepository;
import com.example.dao.repository.ReceiverEmailRepository;
import com.example.dao.repository.UserEmailRepository;

@Controller
@RequestMapping
public class EmailController {
	@Autowired
	private EmailRepository emailRepository;

	@Autowired
	private UserEmailRepository userEmailRepository;

	@Autowired
	private ReceiverEmailRepository receiverEmailRepository;

	@RequestMapping(value = { "email/save" }, method = RequestMethod.POST)
	public @ResponseBody boolean saveEmail(@RequestBody Email email) {
		emailRepository.save(email);
		return true;
	}

	@RequestMapping(value = { "email/save/receiver" }, method = RequestMethod.POST)
	public @ResponseBody boolean saveReceiverEmail(@RequestBody List<String> receiverEmailIds,
			@RequestParam String messageId) {
		ReceiverEmail receiverEmail = new ReceiverEmail();
		receiverEmail.setMessageId(messageId);

		for (String emailId : receiverEmailIds) {
			receiverEmail.setReceiverId(emailId);
			receiverEmailRepository.save(receiverEmail);
		}
		return true;
	}

	@RequestMapping(value = { "email/get" }, method = RequestMethod.GET)
	public @ResponseBody Email getEmail(@RequestParam String messageId) {
		return emailRepository.getEmail(messageId);
	}

	@RequestMapping(value = { "email/get/receiver" }, method = RequestMethod.GET)
	public @ResponseBody List<String> getEmailReceivers(@RequestParam String messageId) {
		return receiverEmailRepository.getReceiversEmail(messageId);
	}

	@RequestMapping(value = { "user/emails/get" }, method = RequestMethod.GET)
	public @ResponseBody List<UserEmail> getUserEmails(@RequestParam String emailId) {
		return userEmailRepository.getEmail(emailId);
	}

	@RequestMapping(value = { "user/email/get" }, method = RequestMethod.GET)
	public @ResponseBody UserEmail getUserEmail(@RequestParam String emailId, @RequestParam String messageId) {
		return userEmailRepository.getUserEmail(emailId, messageId);
	}

	@RequestMapping(value = { "user/email/save" }, method = RequestMethod.POST)
	public @ResponseBody boolean saveUserEmail(@RequestBody UserEmail userEmail) {
		userEmailRepository.save(userEmail);
		return true;
	}
}