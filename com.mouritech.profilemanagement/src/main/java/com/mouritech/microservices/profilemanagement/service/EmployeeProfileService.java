package com.mouritech.microservices.profilemanagement.service;

import java.util.List;

import com.mouritech.microservices.profilemanagement.domain.EmployeeProfile;



public interface EmployeeProfileService {
	
	void addEmployeeProfile(EmployeeProfile empProfile);
	List<EmployeeProfile> getEmployeeProfiles();

}