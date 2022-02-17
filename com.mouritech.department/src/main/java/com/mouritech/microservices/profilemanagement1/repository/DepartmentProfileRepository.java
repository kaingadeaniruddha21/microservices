package com.mouritech.microservices.profilemanagement1.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.microservices.profilemanagement1.domain.DepartmentProfile;




@Repository
public interface DepartmentProfileRepository extends JpaRepository<DepartmentProfile, Long>{

}