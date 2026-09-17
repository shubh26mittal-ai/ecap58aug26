package collections.setcollections;
import java.util.HashSet;
import java.util.Set;
public class StudentsImpl {

	public static void main(String[] args) {
		Students s1 = new Students (101,"Shubh",98);
		Students s2 = new Students (102,"Shubh",98);
		Students s3 = new Students (103,"Shubh",98);
		
		Set<Students>students = new HashSet<Students>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println(students);//[Students [rollno=102, name=Shubh, marks=98], Students [rollno=103, name=Shubh, marks=98], Students [rollno=101, name=Shubh, marks=98]]

	}

}
