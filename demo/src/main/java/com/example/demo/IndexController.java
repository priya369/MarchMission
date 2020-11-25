package com.example.demo;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

@Autowired
EmployeeService em;
	@RequestMapping(value="/Employee",method = RequestMethod.GET)
	public ResponseEntity<HashMap<String,Employee>>   getEmpo() {
		return new ResponseEntity<HashMap<String,Employee>>(em.getEmp(), HttpStatus.OK);
	
		
	}
	@RequestMapping(value="/Employee/{ID}",method = RequestMethod.GET)
		public ResponseEntity<Employee> getempByID(@PathVariable String ID){
			return new ResponseEntity<Employee>(em.getByID(ID), HttpStatus.OK);
			
		}
	
}
