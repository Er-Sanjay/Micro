package com.atos.syntel.CassandraCRUDOperation;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import configuration.MainAppConfiguration;
import entity.Employee;
import service.EmployeeService;

/**
 * Client Application to perform CRUD operations.
 * @author Ranga Reddy
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan("com.atos.syntel.CassandraCRUDOperation")
public class CassandraCrudOperationApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
		//SpringApplication.run(CassandraCrudOperationApplication.class, args);

        // Getting the ApplicationContext
        ApplicationContext applicationContext = 
                   new AnnotationConfigApplicationContext(MainAppConfiguration.class);
        
        //Getting the EmployeeService object.
        EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
        
        Employee employee = new Employee(1, "Ranga", 20000);
        
        // Create the Employee information
        employee = employeeService.createEmployee(employee);
        System.out.println("After Creattion Employee Info: "+employee);
        
       /* System.out.println("Displaying all Employee Info ");
        // Getting All Employees information and printing
        List<Employee> employees = employeeService.getAllEmployees();       
        employees.forEach(emp -> { System.out.println(emp);});  */    
        
        System.out.println("Updating the Employee Info: ");     
        // Updating the Employee information
        employee.setName("Ranga Reddy");
        employee.setSalary(40000);      
        employeeService.updateEmployee(employee);
        
        // Getting the Employee information based on Id
        employee = employeeService.getEmployee(employee.getId());
        System.out.println("After Updation Employee Info: "+employee);      

        System.out.println("Deleting Employee Info ");
        // Deleting the Employee Information
        employeeService.deleteEmployee(employee.getId());
        employee = employeeService.getEmployee(employee.getId());
        System.out.println("After Deletion Employee Info: "+employee);
    }
}