package com.springorm.employee.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.employee.dao.EmployeeDao;
import com.springorm.employee.entity.Employee;

public class RunMain {

	private static ClassPathXmlApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx = 
			new ClassPathXmlApplicationContext(
				"classpath:/com/springorm/employee/test/config.xml");
		
		EmployeeDao employeeDao = 
				(EmployeeDao)ctx.getBean("employeedao");
		
		System.out.println(ctx.getBean("hibernateTemplate"));
		
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("길동");
//		employee.setLastname("박");
//		int result = employeeDao.create(employee);
//		System.out.println(result);
		
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("길동");
//		employee.setLastname("홍");
//		employeeDao.update(employee);
		
//		Employee employee = new Employee();
//		employee.setId(2);
//		employee.setFirstname("길동");
//		employee.setLastname("홍");
//		employeeDao.delete(employee);
		
//		Employee employee= employeeDao.find(1);
//		System.out.println(employee);
		
//		List<Employee> employeeList 
//			= employeeDao.findAll();
//		System.out.println(employeeList);
		
		ctx.close();
	}

}
