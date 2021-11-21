package com.capstone.parking.service;


import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.capstone.parking.entity.UserEntity;
import com.capstone.parking.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<UserEntity> retriveAllProperties() {
		return userRepository.findAll();
	}

}
