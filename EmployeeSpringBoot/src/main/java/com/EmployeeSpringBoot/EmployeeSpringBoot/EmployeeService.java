package com.EmployeeSpringBoot.EmployeeSpringBoot;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> EmployeeList() {
		return this.employeeRepository.findAll();
	}

	public void addEmployee(Employee employee) {
		this.employeeRepository.save(employee);

	}

	public void update(Employee employee) {
		this.employeeRepository.save(employee);

	}

	public void deleteEmployee(Integer id) {
		this.employeeRepository.deleteById(id);

	}

}
