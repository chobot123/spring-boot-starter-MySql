package com.chobot.springbootmysqltemplate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chobot.springbootmysqltemplate.controllers.interfaces.IUserController;
import com.chobot.springbootmysqltemplate.repositories.UserRepository;

@Controller
@RequestMapping(path="/api/users")
public class UserController implements IUserController {
	
	@Autowired
	private UserRepository userRepository;
	
	// ... GET, POST, UPDATE, DELETE, etc...
}
