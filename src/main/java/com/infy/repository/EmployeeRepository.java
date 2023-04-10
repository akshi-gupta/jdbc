package com.infy.repository;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.infy.dto.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeRepository {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public List<Employee> findById(int employeeId) {
        Map<String, Object> args = new HashMap<>();
        args.put("id", employeeId);
        String queryString = "select * from employee where employeeId=:id";
        return jdbcTemplate.query(queryString, args, new EmployeeRowMapper());

//		String queryString = "select * from employee where employeeId=' " + employeeId + " '";
//		return jdbcTemplate.query(queryString, new EmployeeRowMapper());

    }

    public List<Employee> findByName(String firstName) {
//		String queryString = "select * from employee where firstName='" + firstName + "'";
//		return jdbcTemplate.query(queryString, new EmployeeRowMapper());

        Map<String, Object> args = new HashMap<>();
        args.put("name", firstName);

        String queryString = "select * from employee where firstName=:name";
        return jdbcTemplate.query(queryString, args, new EmployeeRowMapper());
    }

    //	public int deleteById(int employeeId){
//		String queryString = "delete from employee where employeeId=' " + employeeId +" '";
//		return jdbcTemplate.update(queryString,employeeId);
//	}
    public int deleteById(int employeeId) {
        Map<String, Object> args = new HashMap<>();
        args.put("id", employeeId);
        String queryString = "delete from employee where employeeId=:id";
        //System.out.println("");
        return jdbcTemplate.update(queryString, args);
    }

    public int addEmployee(Employee employee) {
        SqlParameterSource namedParams = new BeanPropertySqlParameterSource(employee);

        String queryString = "Insert into " +
                "employee(employeeId,firstName,lastName,address,baseLoc,deptNbr,jobNbr,activeStatus,termDate,lastChgTs) " +
                "VALUES(:employeeId,:firstName,:lastName,:address,:baseLoc,:deptNbr,:jobNbr,:activeStatus,:termDate,:lastChgTs) " +
                "ON DUPLICATE KEY UPDATE " +
                "firstName = :firstName, lastName = :lastName, address = :address, baseLoc = :baseLoc, deptNbr = :deptNbr," +
                "jobNbr = :jobNbr, activeStatus = :activeStatus, termDate = :termDate, lastChgTs = :lastChgTs";

        return jdbcTemplate.update(queryString, namedParams);

    }


}
