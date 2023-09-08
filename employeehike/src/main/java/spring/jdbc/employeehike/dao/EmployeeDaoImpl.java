package spring.jdbc.employeehike.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import spring.jdbc.employeehike.dao.rowmapper.EmployeeRowMapper;
import spring.jdbc.employeehike.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	JdbcTemplate jdbcTemplate;
	

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql="insert into employee values(?,?,?)";
		System.out.println(sql);
		jdbcTemplate.update(sql, employee.getId(),employee.getName(),employee.getExp());

	}

	
	public List<Employee> findAllEmployees() {
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		List<Employee> employees=jdbcTemplate.query("select * from employee",rowMapper);
		return employees;
	}

	
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		EmployeeRowMapper rowMapper=new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject("select * from employee where id=?", rowMapper,id);
		
		
		return employee;
	}

}
