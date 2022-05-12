package com.fission.lombokmapstruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fission.lombokmapstruct.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
