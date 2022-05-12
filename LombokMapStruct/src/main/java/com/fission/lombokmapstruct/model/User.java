package com.fission.lombokmapstruct.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	private String userName;
	private String password;
	private long phoneNumber;

}
