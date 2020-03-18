package pl.jaceksysiak.springboot.cruddemo.dao;

import java.util.List;

import pl.jaceksysiak.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
		
}
