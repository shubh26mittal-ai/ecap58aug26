package java8features;

public class Employee {
	Integer Id;
	String name;
	String department;
	double salary;
	public Employee(Integer id, String name, String department, double salary) {
		super();
		Id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	

}
