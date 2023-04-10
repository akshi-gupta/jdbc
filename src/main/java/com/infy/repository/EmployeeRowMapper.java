package com.infy.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.infy.dto.Employee;
//import com.infy.entity.Employee;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee(rs.getInt("employeeId"), rs.getString("firstName"),
                rs.getString("lastName"), rs.getString("address"), rs.getInt("baseLoc"), rs.getInt("deptNbr"),
                rs.getInt("jobNbr"), rs.getString("activeStatus"), rs.getDate("termDate"),
                rs.getTimestamp("lastChgTs"));

//        EmployeeDto emp = new EmployeeDto();
        return employee;
    }
}
