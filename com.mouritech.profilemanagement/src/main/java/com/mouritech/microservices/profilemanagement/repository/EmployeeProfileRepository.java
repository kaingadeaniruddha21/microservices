package com.mouritech.microservices.profilemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.microservices.profilemanagement.domain.EmployeeProfile;



@Repository
public interface EmployeeProfileRepository extends JpaRepository<EmployeeProfile, Long>{

}