package cursors;
import java.util.Enumeration;
import java.util.Vector;
public class EnumerationExamples {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println(v);//[10, 20, 30, 40, 50]
		
		Enumeration e = v.elements();
		System.out.println(e);//java.util.Vector$1@50040f0c
		System.out.println(e.hasMoreElements());//true
		System.out.println(e.nextElement());//10
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
			Integer il = (Integer)e.nextElement();
			System.out.println(il);//10,20,30,40,50
		}

	}

}
