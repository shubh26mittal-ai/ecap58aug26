package java8features;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
//public class StreamBasics {

//	public static void main(String[] args) {
//		Stream<Integer>s1 = Stream.of(10,20,30,40,50);
//		System.out.println(s1); //java.util.stream.ReferencePipeline$Head@65b3120a
//		s1.forEach(s->System.out.println(s));//10,20,30,40,50
		
//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add("Hello");
//		al.add(true);
//		al.add(5.5);
//		al.add('a');
//		System.out.println(al); //[10, Hello, true, 5.5, a]
//		
//		Stream s = al.stream();
//		System.out.println(s);
//		s.forEach(x->System.out.println(x));
//		10
//		Hello
//		true
//		5.5
//		a
//public class StreamBasics {
//    public static void main(String[] args) {
//        List<Integer> nums = Arrays.asList(10, 20, 10, 30, 40, 20, 50);
//        System.out.println(nums);//[10, 20, 10, 30, 40, 20, 50]
//        List s1 = nums.stream().filter(n->n>20).collect(Collectors.toList());
//        System.out.println(s1); //[30, 40, 50]
//        Stream<Integer> s2 = nums.stream();
//        List l1 = s2.filter(n->n>20).collect(Collectors.toList());
//        System.out.println(l1); //[30, 40, 50]
				
//    }
//
//}
public class StreamBasics {
  public static void main(String[] args) {
//	  Employee e1 = new Employee(101, "Shubh", "SDE", 55000);
//      Employee e2 = new Employee(102, "Shubh", "SDE", 45000);
//      Employee e3 = new Employee(103, "Shubh", "SDE", 65000);
//      Employee e4 = new Employee(104, "Shubh", "SDE", 55000);
//      Employee e5 = new Employee(105, "Shubh", "SDE", 85000);
//      ArrayList<Employee> emp = new ArrayList<>();
//      emp.add(e1);
//      emp.add(e2);
//      emp.add(e3);
//      emp.add(e4);
//      emp.add(e5);
//      System.out.println(emp);
//      Stream<Employee> empEle = emp.stream();
//      System.out.println(empEle);   
//      Stream<Employee> empStream2 = emp.stream();
//      List<Employee> result = empStream2 .filter(sal -> sal.getSalary() > 55000).collect(Collectors.toList());
//      System.out.println(result);//
//      [Employee [Id=101, name=Shubh, department=SDE, salary=55000.0], Employee [Id=102, name=Shubh, department=SDE, salary=45000.0], Employee [Id=103, name=Shubh, department=SDE, salary=65000.0], Employee [Id=104, name=Shubh, department=SDE, salary=55000.0], Employee [Id=105, name=Shubh, department=SDE, salary=85000.0]]
//    		  java.util.stream.ReferencePipeline$Head@49c2faae
//    		  [Employee [Id=103, name=Shubh, department=SDE, salary=65000.0], Employee [Id=105, name=Shubh, department=SDE, salary=85000.0]]
//  }
//}
  //map()
	 // List<String> users = Arrays.asList("Shubh", "mittal", "prince", "ShubhSM");
      //System.out.println(users);
      //Stream<String> user = users.stream();
      //List<String> u = user.map(String::toUpperCase).collect(Collectors.toList());
      //System.out.println(u);//[Shubh, mittal, prince, ShubhSM][SHUBH, MITTAL, PRINCE, SHUBHSM]
      //List<Integer> nums = Arrays.asList(10,20,30,40,50);
      //Stream<Integer> s = nums.stream();
     //List<Integer> n = s.map(x->x+15).collect(Collectors.toList());
     //System.out.println(n);//[25, 35, 45, 55, 65]
	  
//	  Employee e1 = new Employee(101, "Shubh", "SDE", 55000);
//      Employee e2 = new Employee(102, "Shubh", "SDE", 45000);
//      Employee e3 = new Employee(103, "Shubh", "SDE", 65000);
//      Employee e4 = new Employee(104, "Shubh", "SDE", 55000);
//      Employee e5 = new Employee(105, "Shubh", "SDE", 85000);
//      ArrayList<Employee> emp = new ArrayList<>();
//      emp.add(e1);
//      emp.add(e2);
//      emp.add(e3);
//      emp.add(e4);
//      emp.add(e5);
//      System.out.println(emp);
//      Stream<Employee> empEle = emp.stream();
//      List<String> l1 = empEle.map(Employee::getName).collect(Collectors.toList());
//      System.out.println(l1);//[Employee [Id=101, name=Shubh, department=SDE, salary=55000.0], Employee [Id=102, name=Shubh, department=SDE, salary=45000.0], Employee [Id=103, name=Shubh, department=SDE, salary=65000.0], Employee [Id=104, name=Shubh, department=SDE, salary=55000.0], Employee [Id=105, name=Shubh, department=SDE, salary=85000.0]]
//      //[Shubh, Shubh, Shubh, Shubh, Shubh]
	  
//	  flapmap()
//	  List<List<Integer>> l1 = Arrays.asList(
//              Arrays.asList(10, 20, 30),
//              Arrays.asList(40, 50, 60),
//              Arrays.asList(70, 80, 90)
//      );
//
//      System.out.println(l1);//[[10, 20, 30], [40, 50, 60], [70, 80, 90]]
//      List<Integer> flat = l1.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
//      System.out.println(flat);//[10, 20, 30, 40, 50, 60, 70, 80, 90]
	  
//	  distinct()
//	  List<Integer> nums = Arrays.asList(10, 20, 10, 30, 40, 20, 50);
//	  Stream<Integer> res = nums.stream();
//	  List<Integer> uniqueEle = res.distinct().collect(Collectors.toList());
//	  System.out.println(uniqueEle);//[10, 20, 30, 40, 50]
	  
//	  Employee e1 = new Employee(101, "Shubh", "SDE", 55000);
//      Employee e2 = new Employee(102, "Shubh", "SDE", 45000);
//      Employee e3 = new Employee(103, "Shubh", "SDE", 65000);
//      Employee e4 = new Employee(104, "Shubh", "SDE", 55000);
//      Employee e5 = new Employee(105, "Shubh", "SDE", 85000);
//
//      ArrayList<Employee> emp = new ArrayList<>();
//      emp.add(e1);
//      emp.add(e2);
//      emp.add(e3);
//      emp.add(e4);
//      emp.add(e5);
//
//      System.out.println(emp);
//
//      Stream<Employee> empEle = emp.stream();
//
//      List<String> dept = empEle.map(Employee::getDepartment).distinct().collect(Collectors.toList());
//      System.out.println(dept);
      //sorted()
	  //ascending order()
//	  List<Integer> nums = Arrays.asList(10, 20, 60, 70, 40, 30, 50);
//
//      Stream<Integer> res = nums.stream().sorted();
//      res.forEach(x -> System.out.println(x));
//
//      
//      List<Integer> list = nums.stream().sorted().collect(Collectors.toList());
//      System.out.println(list);//[10, 20, 30, 40, 50, 60, 70]
	  
	  //descending order()
//	  List<Integer> nums = Arrays.asList(10, 20, 60, 70, 40, 30, 50);
//	  Stream<Integer> res = nums.stream().sorted(Comparator.reverseOrder());
//      res.forEach(x -> System.out.println(x));
//      List<Integer> list = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//      System.out.println(list);//[70, 60, 50, 40, 30, 20, 10]
	  //collect()
//	  List<Integer> nums = Arrays.asList(10, 20, 60, 70, 40, 30, 50);
//	  Stream<Integer> res = nums.stream();               
//      Stream<Integer> s = res.filter(n -> n > 25);
//      s.forEach(x -> System.out.println(x));//30,40,50,60,70
//      Set<Integer> result = nums.stream().filter(n -> n > 25).collect(Collectors.toSet());
//      System.out.println(result);//[50, 70, 40, 60, 30]
	  
//	Employee e1 = new Employee(101, "Shubh", "SDE", 55000);
//    Employee e2 = new Employee(102, "Shubh", "SDE", 45000);
//    Employee e3 = new Employee(103, "Shubh", "SDE", 65000);
//    Employee e4 = new Employee(104, "Shubh", "SDE", 55000);
//    Employee e5 = new Employee(105, "Shubh", "SDE", 85000);
//    ArrayList<Employee> emp = new ArrayList<>();
//    emp.add(e1);
//    emp.add(e2);
//    emp.add(e3);
//    emp.add(e4);
//    emp.add(e5);
//    System.out.println(emp);
//    Stream<Employee>empEle = emp.stream();
//    Map<Integer,String>result = empEle.collect(Collectors.toMap(
//    		Employee::getId,
//    		Employee::getName
//    		
//    		));
//    System.out.println(result);//[Employee [Id=101, name=Shubh, department=SDE, salary=55000.0], Employee [Id=102, name=Shubh, department=SDE, salary=45000.0], Employee [Id=103, name=Shubh, department=SDE, salary=65000.0], Employee [Id=104, name=Shubh, department=SDE, salary=55000.0], Employee [Id=105, name=Shubh, department=SDE, salary=85000.0]]
    //{101=Shubh, 102=Shubh, 103=Shubh, 104=Shubh, 105=Shubh}
	  
	  //count()
//	  List<Integer> nums = Arrays.asList(10, 20, 60, 70, 40, 30, 50);
//
//      Stream<Integer> res = nums.stream();
//
//      long result = res.count();   
//
//      System.out.println(result);//7
	  //min&max()
//	  Employee e1 = new Employee(101, "Shubh", "SDE", 55000);
//    Employee e2 = new Employee(102, "Shubh", "SDE", 45000);
//    Employee e3 = new Employee(103, "Shubh", "SDE", 65000);
//    Employee e4 = new Employee(104, "Shubh", "SDE", 55000);
//    Employee e5 = new Employee(105, "Shubh", "SDE", 85000);
//    ArrayList<Employee> emp = new ArrayList<>();
//    emp.add(e1);
//    emp.add(e2);
//    emp.add(e3);
//    emp.add(e4);
//    emp.add(e5);
//    System.out.println(emp);
//    Stream<Employee>empEle = emp.stream();
//    Optional<Employee> min = emp.stream().min(Comparator.comparing(Employee::getSalary));
//    System.out.println(min.get());
//    Optional<Employee> max = emp.stream().max(Comparator.comparing(Employee::getSalary));
//    System.out.println(max.get());
   // [Employee [Id=101, name=Shubh, department=SDE, salary=55000.0], Employee [Id=102, name=Shubh, department=SDE, salary=45000.0], Employee [Id=103, name=Shubh, department=SDE, salary=65000.0], Employee [Id=104, name=Shubh, department=SDE, salary=55000.0], Employee [Id=105, name=Shubh, department=SDE, salary=85000.0]]
//    		Employee [Id=102, name=Shubh, department=SDE, salary=45000.0]
//    		Employee [Id=105, name=Shubh, department=SDE, salary=85000.0]
	 // grouping()
//	  Employee e1 = new Employee(101, "Shubh", "SDE", 55000);
//	    Employee e2 = new Employee(102, "Shubh", "SDE", 45000);
//	    Employee e3 = new Employee(103, "Shubh", "SDE", 65000);
//	    Employee e4 = new Employee(104, "Shubh", "SDE", 55000);
//	    Employee e5 = new Employee(105, "Shubh", "SDE", 85000);
//	    ArrayList<Employee> emp = new ArrayList<>();
//	    emp.add(e1);
//	    emp.add(e2);
//	    emp.add(e3);
//	    emp.add(e4);
//	    emp.add(e5);
//	    System.out.println(emp);
//	    Stream<Employee>empEle = emp.stream();
//	    Map<String,List<Employee>> result = empEle.collect(Collectors.groupingBy(Employee::getDepartment));
//	    System.out.println(result);
	  //partitioning by()
//	  Employee e1 = new Employee(101, "Shubh", "SDE", 55000);
//	    Employee e2 = new Employee(102, "Shubh", "SDE", 45000);
//	    Employee e3 = new Employee(103, "Shubh", "SDE", 65000);
//	    Employee e4 = new Employee(104, "Shubh", "SDE", 55000);
//	    Employee e5 = new Employee(105, "Shubh", "SDE", 85000);
//	    ArrayList<Employee> emp = new ArrayList<>();
//	    emp.add(e1);
//	    emp.add(e2);
//	    emp.add(e3);
//	    emp.add(e4);
//	    emp.add(e5);
//	    System.out.println(emp);
//	    Stream<Employee>empEle = emp.stream();
//	    Map<Boolean,List<Employee>> res = empEle.collect(Collectors.partitioningBy(e->e.getSalary()>50000));
//	    System.out.println(res);
	  //joining()
//	  List <String>users = Arrays.asList("Shubh","Mittal","prince","vivek");
//	  String result = users.stream().collect(Collectors.joining("/"));
//	  System.out.println(result);//Shubh/Mittal/prince/vivek
	    
    }
  
}
	  
  
