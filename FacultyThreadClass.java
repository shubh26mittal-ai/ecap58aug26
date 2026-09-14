package multithreading;

public class FacultyThreadClass extends Thread{
	ClassRoom c1;
	String faculty;
	FacultyThreadClass(ClassRoom c1, String faculty)
	{
		this.c1=c1;
		this.faculty=faculty;
	}
	public void run()
	{
		c1.takeClass(faculty);
	}

	public static void main(String[] args) {
		ClassRoom c2 = new ClassRoom();
		FacultyThreadClass ft1 = new FacultyThreadClass (c2,"shubh");
		ft1.start();
		FacultyThreadClass ft2 = new FacultyThreadClass (c2,"Harish");
	    ft2.start();
	    FacultyThreadClass ft3 = new FacultyThreadClass (c2,"Harsh");
	    ft3.start();

	}

}

