package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo {
HashMap<String, Employee> hm=new HashMap<>();

public HashMap<String,Employee> getAllEmployee(){
	Employee e=new Employee();
	e.setEid("priyabrata145678");
	e.setEname("Priyabrata Jena");
	e.setDepartment("SDE");
	e.setMGRname("John alex");
	Employee e1=new Employee();
	e1.setEid("Sourabh513678");
	e1.setEname("Sourabh swain");
	e1.setDepartment("analytics");
	e1.setMGRname("Robin lodu");
	Employee e2=new Employee();
	e2.setEid("Shibu189679");
	e2.setEname("Shibu manna");
	e2.setDepartment("analytics");
	e2.setMGRname("Yogendra Shukla");
	Employee e3=new Employee();
	e3.setEid("Abhijit345278");
	e3.setEname("Abhijit mehta");
	e3.setDepartment("SDE");
	e3.setMGRname("marrya box");
	hm.put("Exl", e);
	hm.put("ACC", e1);
	hm.put("Cong", e2);
	hm.put("Capg", e3);
	
	return hm;
	
}
public Employee getAllEmployeeBYID(String Id){
	return hm.get(Id);
}

}
