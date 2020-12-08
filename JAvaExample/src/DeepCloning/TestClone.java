package DeepCloning;


public class TestClone {
public static void main(String[] args) {
	Course course=new Course("physics", "Chemistry", "mathematics");
	Student st=new Student(1646, "priyabrata Jena",course);
	Student sdr=null;
	try {
		sdr=(Student)st.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(st.course.subject1);
	sdr.course.subject1="Biology";
	System.out.println(st.course.subject1);
}
}
