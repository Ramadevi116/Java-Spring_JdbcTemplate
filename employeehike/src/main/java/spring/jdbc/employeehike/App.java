package spring.jdbc.employeehike;
import spring.jdbc.employeehike.business.EmployeeBusinessImpl;
import spring.jdbc.employeehike.dto.Employee;
import spring.jdbc.employeehike.business.EmployeeBusiness;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        EmployeeBusiness employeeBusiness=(EmployeeBusinessImpl) context.getBean("employeeBusiness"); 
       
        //Employee emp=new Employee("11","Ramaaa",18);
        //employeeBusiness.insertEmployee(emp);
        
        employeeBusiness.printEmployeeHikes();
        Employee employee=employeeBusiness.getEmployeeById("9");
        System.out.println(employee.toString());
    }
}
