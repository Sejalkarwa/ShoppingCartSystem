package io.sejal.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sejal.springboot.model.User;
import io.sejal.springboot.service.UserService;
@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	// Add User (POST)
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	//Get All Users (GET)
	@GetMapping
	public List<User>getAllUsers(){
		return userService.getAllUsers();	
		}
	
	// Get User BY ID (PUT)
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable long id, @RequestBody User updateUser) {
		 User existingUser = userService.getUserById(id);
	        if (existingUser != null) {
	            existingUser.setName(updateUser.getName());
	            existingUser.setEmail(updateUser.getEmail());
	            existingUser.setPassword(updateUser.getPassword());
	            existingUser.setAddress(updateUser.getAddress());
	            existingUser.setContactNo(updateUser.getContactNo());
	            return userService.createUser(existingUser); // reuse createUser for update
	        }
	        return null;
	    }

	    // Delete User by ID (Optional)
	    @DeleteMapping("/delete/{id}")
	    public String deleteUser(@PathVariable Long id) {
	        User user = userService.getUserById(id);
	        if (user != null) {
	            userService.deleteUser(id);
	            return "User deleted with ID: " + id;
	        } else {
	            return "User not found";
	        }
	    }
	}

