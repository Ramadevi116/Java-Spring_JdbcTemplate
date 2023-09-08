package spring.jdbc.employeehike.business;

import java.util.List;

import spring.jdbc.employeehike.dao.EmployeeDao;
import spring.jdbc.employeehike.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {
		private EmployeeDao employeeDao;
		
	public EmployeeDao getEmployeeDao() {
			return employeeDao;
		}

		public void setEmployeeDao(EmployeeDao employeeDao) {
			this.employeeDao = employeeDao;
		}

	
	public void printEmployeeHikes() {
		// TODO Auto-generated method stub
		List<Employee> employees=employeeDao.findAllEmployees();
		if(employees!=null) {
			for(Employee employee : employees) {
				if(employee.getExp()>=15) {
					System.out.println("Helo "+employee.getName()+" u got 15% Hike " );
				}else if(employee.getExp()>=10) {
					System.out.println("Helo "+employee.getName()+" u got 10% Hike " );
				}else if(employee.getExp()>=5) {
					System.out.println("Helo "+employee.getName()+" u got 5% Hike " );
				}else {
					System.out.println("Helo "+employee.getName()+" u got 3% Hike " );
				}
			}
		}

	}

	
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 employeeDao.insertEmployee(employee);
		
	}

	@Override
	public Employee getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(id);
	}

}
