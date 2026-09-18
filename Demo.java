//package comparson;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.*;
//public class Demo {

//	public static void main(String[] args) {
//		    Employee e1 = new Employee(103, "Shubh");
//	        Employee e2 = new Employee(101, "Shubh");
//	        Employee e3 = new Employee(102, "Shubh");
//	        ArrayList<Employee> list = new ArrayList<Employee>();
//	        list.add(e1);
//	        list.add(e2);
//	        list.add(e3);
//	        System.out.println(list); //[103 Shubh, 101 Shubh, 102 Shubh]     
//	        Collections.sort(list);        
//	        System.out.println(list); //[101 Shubh, 102 Shubh, 103 Shubh]

//	}

//}
		
//example for comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Demo {
	public static void main(String[]args)
	{
		Employee e1 = new Employee(103,"Shubh");
        Employee e2 = new Employee(101, "Shubh");
        Employee e3 = new Employee(102, "Shubh");
        Employee e4 = new Employee(104, "Shubh");

        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        Collections.sort(list, new ComparatorLogicClass());

        System.out.println(list);
        System.out.println(list);
	}
}
