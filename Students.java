package collections.setcollections;

public class Students {
	int rollno;
	String name;
	int marks;
	public Students(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
