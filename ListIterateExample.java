package cursors;
import java.util.LinkedList;
import java.util.ListIterator;
public class ListIterateExample {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(55);
		l1.add(3);
		ListIterator l = l1.listIterator();
//		System.out.println(l.hasNext());//true
//		System.out.println(l.next());//10
//		System.out.println(l.hasNext());//true
//		System.out.println(l.next());//20
//		System.out.println(l.hasNext());//true
//		System.out.println(l.next());//30
		while(l.hasNext())
		{
			Integer il = (Integer)l.next();
			if(il.equals(10))
			{
				l.add(100);
			}
			else if(il.equals(20))
			{
				l.remove();
			}
			else if(il.equals(30))
			{
				l.set(300);
			}
			
//			System.out.println(il);
		}
//		System.out.println(l1);//[10, 100, 300, 40, 55, 3]
		
		while(l.hasPrevious())
		{
			Integer il = (Integer)l.previous();
			System.out.println(il);//10,100,300,40,55,3
		}
			
//		System.out.println(l.hasPrevious());//false
//		System.out.println(l.next());//10
//		System.out.println(l.hasPrevious());//false
//		System.out.println(l.next());//20
//		System.out.println(l.hasPrevious());//false
//		System.out.println(l.next());//30
		
		

	}

}
