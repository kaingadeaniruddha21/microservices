package com.mouritech.microservices.profilemanagement1.service;

import java.util.List;

import com.mouritech.microservices.profilemanagement1.domain.DepartmentProfile;





public interface DepartmentProfileService {
	
	void addDepartmentProfile(DepartmentProfile deptProfile);
	List<DepartmentProfile> getDepartmentProfiles();
	

}