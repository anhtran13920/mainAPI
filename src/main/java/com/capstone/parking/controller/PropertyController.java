package com.capstone.parking.controller;


import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capstone.parking.entity.UserEntity;
import com.capstone.parking.service.UserService;

@RestController
public class PropertyController {

	@Autowired
	private UserService userService;

	@GetMapping("/property")
	public List<UserEntity> retriveAllProperties() {
		System.out.println("console");
		return userService.retriveAllProperties();
	}
}
