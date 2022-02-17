package com.mouritech.microservices.profilemanagement1.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept_profile")
public class DepartmentProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private Long deptId;
	
	@Column(name = "dept_name")
	private String deptName;
	
	@Column(name = "dept_employee")
	private Long deptEmployee;
	
	public DepartmentProfile() {
		// TODO Auto-generated constructor stub
	}

	public DepartmentProfile(String deptName, Long deptEmployee) {
		super();
		this.deptName = deptName;
		this.deptEmployee = deptEmployee;
	}

	public DepartmentProfile(Long deptId, String deptName, Long deptEmployee) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptEmployee = deptEmployee;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Long getDeptEmployee() {
		return deptEmployee;
	}

	public void setDeptEmployee(Long deptEmployee) {
		this.deptEmployee = deptEmployee;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
