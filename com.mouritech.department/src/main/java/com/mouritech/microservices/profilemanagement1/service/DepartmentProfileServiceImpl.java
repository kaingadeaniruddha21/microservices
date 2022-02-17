package com.mouritech.microservices.profilemanagement1.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.microservices.profilemanagement1.domain.DepartmentProfile;
import com.mouritech.microservices.profilemanagement1.repository.DepartmentProfileRepository;



@Service
public class DepartmentProfileServiceImpl implements DepartmentProfileService{
	
	@Autowired
	private DepartmentProfileRepository deptProfileRepo;
	/*
	 * @Override public void addDepartmentProfile(DepartmentProfile deptProfile) {
	 * deptProfileRepo.save(deptProfile);
	 * 
	 * }
	 */

	@Override
	public List<DepartmentProfile> getDepartmentProfiles() {

		return deptProfileRepo.findAll();
	}

	@Override
	public void addDepartmentProfile(DepartmentProfile deptProfile) {
		// TODO Auto-generated method stub
		deptProfileRepo.save(deptProfile);
	}

}