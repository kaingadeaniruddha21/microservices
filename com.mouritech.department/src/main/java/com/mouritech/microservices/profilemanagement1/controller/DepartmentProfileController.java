package com.mouritech.microservices.profilemanagement1.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.microservices.profilemanagement1.domain.DepartmentProfile;
import com.mouritech.microservices.profilemanagement1.service.DepartmentProfileService;




@RestController
@RequestMapping(value = "/")
public class DepartmentProfileController {
	
	@Autowired
	private DepartmentProfileService deptProfileService;
	
	@PostMapping
	public void addDepartmentProfile(@RequestBody DepartmentProfile deptProfile) {
		deptProfileService.addDepartmentProfile(deptProfile);
	}
	
	@GetMapping
	public List<DepartmentProfile> getDepartmentProfiles() {

		return deptProfileService.getDepartmentProfiles();
	}
}