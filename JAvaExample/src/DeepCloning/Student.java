package DeepCloning;



public class Student implements Cloneable{
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
		Student s=(Student)super.clone();
		s.course=(Course)course.clone();
		return s;
	}
}
