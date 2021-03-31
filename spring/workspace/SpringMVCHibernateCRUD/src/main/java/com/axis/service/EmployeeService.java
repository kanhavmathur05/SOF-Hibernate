package com.axis.service;

import java.util.List;

import com.axis.model.Employee;

public interface EmployeeService {
	public void addEmployee(Employee employee);

	public List<Employee> getAllEmloyees();

	public void deleteEmployee(Integer employeeId);

	public Employee getEmployee(int employeeId);

	public Employee updateEmployee(Employee employee);

}
