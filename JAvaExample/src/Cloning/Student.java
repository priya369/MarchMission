package Cloning;

public class Student implements Cloneable {
int id;
String name;
Course course;
public Student(int id, String name,Course course) {
	this.id = id;
	this.name = name;
	this.course=course;
}

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
}
