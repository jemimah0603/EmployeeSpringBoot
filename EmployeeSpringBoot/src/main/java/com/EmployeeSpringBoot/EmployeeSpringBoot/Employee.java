package com.EmployeeSpringBoot.EmployeeSpringBoot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer impId;
	private String empName;
	private String empDeignation;
	private String empEmail;
	private int empJoiningYear;

	public Employee() {
		super();

	}

	public Employee(int impId, String empName, String empDeignation, String empEmail, int empJoiningYear) {
		super();
		this.impId = impId;
		this.empName = empName;
		this.empDeignation = empDeignation;
		this.empEmail = empEmail;
		this.empJoiningYear = empJoiningYear;
	}

	public int getImpId() {
		return impId;
	}

	public void setImpId(int impId) {
		this.impId = impId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDeignation() {
		return empDeignation;
	}

	public void setEmpDeignation(String empDeignation) {
		this.empDeignation = empDeignation;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public int getEmpJoiningYear() {
		return empJoiningYear;
	}

	public void setEmpJoiningYear(int empJoiningYear) {
		this.empJoiningYear = empJoiningYear;
	}

}
