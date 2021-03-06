package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.EmployeeDAO;
import entity.Employee;

/**
 * Service Impl class for Employee to perform CRUD operation.
 * @author Ranga Reddy
 * @version 1.0
 */
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired  
    private EmployeeDAO employeeDAO;

    /**
     * 
     */
    public EmployeeServiceImpl() {
        super();    
    }

    @Override
    @Transactional
    public Employee createEmployee(Employee employee) {     
        return employeeDAO.createEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {       
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public Employee updateEmployee(Employee employee) {     
        return employeeDAO.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {        
        employeeDAO.deleteEmployee(id);
    }

    /*@Override
    @Transactional
    public List<Employee> getAllEmployees() {       
        return employeeDAO.getAllEmployees();
    }*/
}