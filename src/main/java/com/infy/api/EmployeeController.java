package com.infy.api;



import java.util.List;

import com.infy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.infy.dto.Employee;




@RestController
//@RequestMapping(path="/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
//	@RequestMapping("/id")
//	public ResponseEntity<EmployeeDto> getCustomer(@PathVariable Integer employeeId){
//		EmployeeDto employee = employeeService.getId(employeeId);
//		return new ResponseEntity<>(employee, HttpStatus.OK);
//	}
	
	@GetMapping(path="/employees/{id}")
	public ResponseEntity<List<Employee>> getEmployeeById(@PathVariable Integer id) {
		List<Employee> employees = employeeService.getId(id);
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}

	@GetMapping(path = "/employees/name/{name}")
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String name){
		List<Employee> employees = employeeService.getName(name);
		return new ResponseEntity<>(employees, HttpStatus.OK);

	}

	@DeleteMapping(path = "employees/del/{id}")
	public ResponseEntity  deleteEmployeeById(@PathVariable Integer id){
		int employees = employeeService.deleteRow(id);
		if (employees == 0) {
			System.out.println("can not found the row");

			return new ResponseEntity(employees, HttpStatus.NOT_FOUND);
		} else {
			System.out.println("row deleted");

			return new ResponseEntity(employees, HttpStatus.OK);
		}



	}
	@PostMapping(path = "/employees")
	public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee){
		int employees = employeeService.addRow(employee);
		return new ResponseEntity(employees,HttpStatus.OK);

	}


}
