package com.fission.lombokmapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.fission.lombokmapstruct.dtos.UserGetDto;
import com.fission.lombokmapstruct.dtos.UserPostDto;
import com.fission.lombokmapstruct.model.User;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
	User userPostDtoToUser(UserPostDto userPostDto);
	UserGetDto userToUserGetDto(User user);
	List<UserGetDto> getAllUser(List<User> user);

}
