package spring.jdbc.employeehike.business;

import spring.jdbc.employeehike.dto.Employee;

public interface EmployeeBusiness {
	void printEmployeeHikes();
	void insertEmployee(Employee employee);
	Employee getEmployeeById(String id);
}
