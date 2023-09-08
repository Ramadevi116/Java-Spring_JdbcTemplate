package spring.jdbc.employeehike.dao;

import java.util.List;

import spring.jdbc.employeehike.dto.Employee;


public interface EmployeeDao {
	void insertEmployee(Employee employee);
	List<Employee> findAllEmployees();
	Employee getEmployeeById(String id);

}
