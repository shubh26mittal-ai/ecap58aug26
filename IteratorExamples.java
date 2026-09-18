package cursors;
import java.util.Iterator;
import java.util.LinkedList;
public class IteratorExamples {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(55);
		l1.add(3);
		System.out.println(l1);//[10, 20, 30, 40, 55, 3]
		
		Iterator il = l1.iterator();
//		System.out.println(il);//java.util.LinkedList$ListItr@2dda6444
//		System.out.println(il.hasNext());//true
//		System.out.println(il.next());//10
//		il.remove();
//		System.out.println(l1);//[20, 30, 40, 55, 3]
		
		while(il.hasNext())
		{
			Integer i2 = (Integer)il.next();
//			System.out.println(i2);
			if(i2%2 ==0)
			{
				System.out.println(i2);
			}else {
				il.remove();//10,20,30,40
			}
		}
		
		

	}

}
