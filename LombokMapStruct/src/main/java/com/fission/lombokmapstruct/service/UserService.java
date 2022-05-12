package com.fission.lombokmapstruct.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fission.lombokmapstruct.dtos.UserGetDto;
import com.fission.lombokmapstruct.dtos.UserPostDto;
import com.fission.lombokmapstruct.mapper.MapStructMapper;
import com.fission.lombokmapstruct.model.User;
import com.fission.lombokmapstruct.repository.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

	private MapStructMapper mapper;

	// @Autowired
	public UserService(UserRepository userRepository, MapStructMapper mapper) {
		super();
		this.userRepository = userRepository;
		this.mapper = mapper;
	}

	public List<UserGetDto> getUsers() {
		return mapper.getAllUser(userRepository.findAll());
	}

	public UserGetDto addUser(UserPostDto userPostDto) {
	return 	mapper.userToUserGetDto( userRepository.save(mapper.userPostDtoToUser(userPostDto)));
		
		

	}

	public UserGetDto getUserById(Integer id) {
		return mapper.userToUserGetDto(userRepository.findById(id).orElse(null));
	}

	public UserGetDto editUser(UserPostDto userPostDto, Integer id) {
		User user = userRepository.findById(id).orElse(null);
		user.setUserName(userPostDto.getUserName());
		user.setPassword(userPostDto.getPassword());
		user.setPhoneNumber(userPostDto.getPhoneNumber());
		userRepository.save(user);
		return mapper.userToUserGetDto(user);
	}

	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
