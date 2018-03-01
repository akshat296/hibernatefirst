package com.example.test;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.test.entities.Employee;

@SpringBootApplication
public class SpringBootHibernateProjectApplication implements CommandLineRunner{

	@Autowired
	private EmployeeDao employeeDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception{
		Employee employee = getEmployee();
		employeeDao.createEmployee(employee);
		
		
		
	}
	private Employee getEmployee() {
		Employee employee = new Employee();
		employee.setName("akshat tandon");
		employee.setSalary(30000.00);
		employee.setDoj(new Date());
		return employee;
		
	}
}
