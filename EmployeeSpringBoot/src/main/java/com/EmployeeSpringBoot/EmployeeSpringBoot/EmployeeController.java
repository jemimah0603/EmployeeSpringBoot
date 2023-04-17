package com.EmployeeSpringBoot.EmployeeSpringBoot;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeeapi")
public class EmployeeController {
   @Autowired
	private EmployeeService employeeService;

	@GetMapping("/getemployee")
	public List<Employee> employees() {
		List<Employee> list = this.employeeService.EmployeeList();
		return list;
	}

	@PostMapping("/postemployee")
	public String newEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee added Successfully";
	}

	@PutMapping("/putemployee")
	public String updateEmployee(@RequestBody Employee employee) {
		employeeService.update(employee);
		return "The employee has successfully updated";

	}

	@DeleteMapping("/deleteemployee")
	public String deleteemployee(@PathVariable Integer impid) {
		employeeService.deleteEmployee(impid);
		return "Employee has been successfully deleted";
	}

}
