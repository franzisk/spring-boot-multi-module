package org.thecompany.rest.module.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thecompany.email.module.app.service.EmailService;
import org.thecompany.user.module.app.model.User;
import org.thecompany.user.module.app.service.UserService;

@RestController
@RequestMapping("api/")
public class AppController {

	@Autowired
	private EmailService emailService;

	@Autowired
	private UserService userService;

	@GetMapping("user/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUserById(id);
	}

	@PostMapping("user/")
	public ResponseEntity<String> sendEmail(@RequestBody User user) {
		userService.sendEmail(user);
		return new ResponseEntity<>("Email Successfully sent", HttpStatus.OK);
	}

	@PostMapping("email/{toMailAddress}")
	public ResponseEntity<Void> sendEmail(@PathVariable String toMailAddress) {
		emailService.sendEmail(toMailAddress);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
