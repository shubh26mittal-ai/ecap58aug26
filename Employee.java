package comparson;

public class Employee implements Comparable<Employee>{
//	int id;
//    String name;

//    Employee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }

//    @Override
//    public int compareTo(Employee e) {
//        return this.id - e.id;   // ascending order by id
//    }

//    @Override
//    public String toString() {
//        return this.id + " " + name;
//    }

	
//	}
	
//examples of comparator
	package comparson;
	public class Employee {
	    Integer id;
	    String name;

	    Employee(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return id + " " + name;
	    }
	}
