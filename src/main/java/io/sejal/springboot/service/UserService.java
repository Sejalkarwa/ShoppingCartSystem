package io.sejal.springboot.service;

import java.util.List;
import io.sejal.springboot.model.User;

public interface UserService {
	User createUser(User user);
	List<User>getAllUsers();
	User getUserById(Long id);
	void deleteUser(Long id);

}
