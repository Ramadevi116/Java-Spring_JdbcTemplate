
package spring.jdbc.employeehike.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import spring.jdbc.employeehike.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setId(rs.getString(1));
		employee.setName(rs.getString(2));
		employee.setExp(rs.getInt(3));
		
		return employee;
	}

}
