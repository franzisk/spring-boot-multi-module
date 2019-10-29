package org.thecompany.user.module.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thecompany.email.module.app.service.EmailService;
import org.thecompany.user.module.app.model.User;

@Service
public class UserService {

	@Autowired
	private EmailService emailService;

	private final List<User> users = new ArrayList<>();

	@PostConstruct
	public void init() {
		users.add(new User(1, "Fernando", "Souza", "fernando.souza@gmail.com"));
		users.add(new User(2, "Roberto", "Souza", "roberto.souza@gmail.com"));
		users.add(new User(3, "Antonio", "Souza", "antonio.souza@gmail.com"));
		users.add(new User(4, "Marcos", "Souza", "marcos.souza@gmail.com"));
	}

	public User getUserById(final int id) {

		return users.stream().filter(user -> user.getId() == id).findFirst().get();
	}

	public void sendEmail(User user) {
		emailService.sendEmail(user.getEmail());
	}

	public String randomString(int length) {
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = length;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();
		return generatedString.substring(0, 1).toUpperCase() + generatedString.substring(1);
	}
}