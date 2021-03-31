package com.axis.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.dao.EmployeeDao;
import com.axis.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}

	@Override
	@Transactional
	public List<Employee> getAllEmloyees() {
		return employeeDao.getAllEmloyees();
	}

	@Override
	@Transactional
	public void deleteEmployee(Integer employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}

	public Employee getEmployee(int employeeId) {
		return employeeDao.getEmployee(employeeId);
	}

	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	
}
