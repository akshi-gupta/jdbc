package com.infy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.dto.Employee;
import com.infy.repository.EmployeeRepository;

import java.util.List;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getId(int employeeId) {
		return employeeRepository.findById(employeeId);

	}
	public List<Employee> getName(String firstName){
		return employeeRepository.findByName(firstName);
	}
	public int deleteRow(int employeeId){
		return employeeRepository.deleteById(employeeId);
	}

	public  int addRow(Employee employee){
		return employeeRepository.addEmployee(employee);
	}




}
