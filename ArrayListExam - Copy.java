package collection;

import java.util.*;
import AdvancedConcept.*;
public class ArrayListExam {
	public static void main(String[] args)
	{
		Student s1=new Student(11,"Janu");
		Student s2=new Student(14,"Himesh");
		ArrayList<Student>l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		Iterator<Student> itr=l.iterator();
		while(itr.hasNext())
		{

			Student s11=(Student) itr.next();//Integer a=(Integer) itr.next();
			System.out.println(s11.Rollno+" "+s11.name);
		}
		
	}
}
	
	
//		List<Integer>i=new ArrayList<>();//upcasting
//		i.add(8);
//		i.add(10);
//		i.add(35);
//		i.add(20);
//		System.out.println("Before delete: "+i);
//		i.remove(0);
//		System.out.println("After deletion: "+i);
//		Collections.sort(i);
//		System.out.println("Sorted array: "+i);
//	}
//}
		
		
		
//		List<String>set= new ArrayList<>();//sort array using list not support in set
//		set.add("Sammy");
//		set.add("Apple");
//		set.add("namo");
//		set.add("Om");
//		set.add("Shivay");
//		Collections.sort(set);
//		System.out.println(set);
//		
//	}}
	
//		List<Integer>list = new LinkedList<>();
//		Set<Integer>set = new LinkedHashSet<>();
//		//list=new ArrayList();
//		list = Arrays.asList(1,2,3,4,1,2,3,4,1,3);
//		set.addAll(list);//List.clear()throws unsupportedOperationException 
//		System.out.println("Set: "+set);
//		System.out.println("List: "+list);
//		System.out.println("Set size: "+set.size());
//		System.out.println("List size: "+list.size());
//		
////		int arr[]= {1,2,3,4,5,5};//Array to ArrayList
////		for(Integer item :arr) 
////		{
////			list.add(item);
////		}
////		System.out.println(list);
//	}
//}
	
	
//	public static void main(String[] args) {
//		List<Integer>l=new LinkedList<>();
//		l.add(1);
//		l.add(2);
//		l.add(3);
//		l.add(4);
//		Iterator<Integer>k= l.iterator();
//		while(k.hasNext())
//		{
//			Integer a=k.next();
//			if(a%2==0) {
//				//l.remove(a);
//				System.out.println(l);
//				
//			}
//		}
//		//System.out.println(l);
//	}
//}
//	public static void main(String[] args) {
//		ArrayList<Integer>a=new ArrayList<>();
//		a.add(4);
//		a.add(6);
//		a.add(7);
//		a.add(6);
//		a.add(8);
//		a.add(6);
//		
//		a.remove(2);
//		Iterator<Integer>n=a.iterator();//iterate the list
//		while(n.hasNext())
//		{
//			Integer r=n.next();
//			if(r==6)
//			{
//				
//				n.remove();
//			}
//		}
//		
//	System.out.println(a);
//	}
//}
	
	
	
//	public static void main(String args[]) 
//	{
//		ArrayList<Integer>a=new ArrayList<Integer>();
//		//Integer b=7;
//		//a.add(null);
//		a.add(3);
//		a.add(4);
//		a.add(7);
//		a.add(6);
//		for(Integer f:a)
//		{
//			if(f%2==0)
//		{
//				System.out.println("Found element");
//				a.remove(f);
////				Exception in thread "main" java.util.ConcurrentModificationException
////				at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
////				at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
////				at collection.ArrayListExam.main(ArrayListExam.java:16)
//
//				//break;
//			}
//		}
//		System.out.println(a);
//}
//}
	
	
	
	
//	public static void main(String args[]) {
//		ArrayList<Integer> Name = new ArrayList<>();
//		Name.add(12);
//		Name.add(17);
//		Name.add(46);
//		Name.add(null);
//		System.out.println(Name);
//		Iterator<Integer>Nam=Name.iterator();
//		while(Nam.hasNext()) {
//		Integer a=Nam.next();
//		if(a!=null && a%2==0)
//		{
//			System.out.println(a);
//		}
//	}
//
//}
//}
