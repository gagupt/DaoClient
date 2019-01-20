package com.example.dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.entity.User;
import com.example.dao.repository.UserRepository;

@Controller
@RequestMapping
public class UserController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = { "user/save" }, method = RequestMethod.POST)
	public @ResponseBody String addNewUser(@RequestBody User user) {
		userRepository.save(user);
		return "Saved";
	}

	@RequestMapping(value = { "user/get" }, method = RequestMethod.GET)
	public @ResponseBody User getUser(@RequestParam String emailId) {
		return userRepository.getUser(emailId);
	}
}