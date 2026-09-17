package collections.listcollections;
import java.util.ArrayList;
import java.util.List;
public class EmpImpl {
	public static void main(String[]args) {
		Employee e1 = new Employee (101,"Shubh",45000);
		Employee e2 = new Employee (102,"Shubh",50000);
		Employee e3 = new Employee (103,"Shubh",35000);
		List<Employee>emp = new ArrayList();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		System.out.println(emp);
	}

}
