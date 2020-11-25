package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

@Autowired
EmployeeRepo repo;

public HashMap<String, Employee> getEmp(){
	return repo.getAllEmployee();
}
public Employee getByID(String Id) {
	return repo.getAllEmployeeBYID(Id);
	
}
}
