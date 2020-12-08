package Cloning;

public class TestClone {
	
public static void main(String[] args) {
	

Course course=new Course("physics", "Chemistry", "mathematics");
Student st=new Student(1646, "priyabrata Jena",course);
Student student=null;
try {
	student=(Student)st.clone();
}
catch(CloneNotSupportedException e) {
	// TODO: handle exception
	e.printStackTrace();
}
System.out.println(st.course.subject3);
student.course.subject3="Biology";
System.out.println(st.course.subject3);
}
}
