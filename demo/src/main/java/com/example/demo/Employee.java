package com.example.demo;

public class Employee {
String Eid;
String Ename;
String Department;
String MGRname;
public String getEid() {
	return Eid;
}
public void setEid(String eid) {
	Eid = eid;
}
public String getEname() {
	return Ename;
}
public void setEname(String ename) {
	Ename = ename;
}
public String getDepartment() {
	return Department;
}
public void setDepartment(String department) {
	Department = department;
}
public String getMGRname() {
	return MGRname;
}
public void setMGRname(String mGRname) {
	MGRname = mGRname;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Eid+" "+this.Ename+" "+this.Department+" "+this.MGRname;
	}
}
