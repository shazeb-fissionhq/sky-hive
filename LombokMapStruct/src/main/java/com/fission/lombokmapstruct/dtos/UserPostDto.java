package com.fission.lombokmapstruct.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserPostDto {
	private Integer id;
	private String userName;
	private String password;
	private long phoneNumber;

	
}
