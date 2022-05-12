package com.fission.lombokmapstruct.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fission.lombokmapstruct.dtos.UserGetDto;
import com.fission.lombokmapstruct.dtos.UserPostDto;
import com.fission.lombokmapstruct.service.UserService;

@RestController
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<UserGetDto> getUsers() {
		return userService.getUsers();
	}

	@PostMapping("/users")
	public UserGetDto addUser(@RequestBody UserPostDto userPostDto) {
		return userService.addUser(userPostDto);
	}

	@PutMapping("/users/{id}")
	public UserGetDto editUser(@RequestBody UserPostDto userPostDto, @PathVariable Integer id) {
		return userService.editUser(userPostDto, id);
	}

	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);

	}

	@GetMapping("/users/{id}")
	public UserGetDto getUserId(@PathVariable Integer id) {
		return userService.getUserById(id);
	}

}
