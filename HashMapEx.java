package collection;
import AdvancedConcept.book;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) 
	{
		Map<Integer, book>map=new HashMap<Integer,book>();
		Map<Integer, book>Finalmap=new HashMap<Integer,book>();
		book s1=new book(11,2012l,"NK","Paru");
		book s2=new book(10,2022l,"NK1","Paru1");
		book s3=new book(101,2092l,"NK2","Paru2");
		 map.put(1, s1);
		 map.put(2, s2);
		 map.put(3, s3);
		 map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
		 map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEachOrdered(e->Finalmap.put(e.getKey(),e.getValue()));
		System.out.println(Finalmap);
	}
}
		

		
		
//		Map<Integer, book>map=new HashMap<Integer,book>();
//		book s1=new book(11,2012l,"NK","Paru");
//		book s2=new book(10,2022l,"NK1","Paru1");
//		book s3=new book(101,2092l,"NK2","Paru2");
//		 map.put(1, s1);
//		 map.put(2, s2);
//		 map.put(3, s3);
//		 map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//		 reverse order as per key..but getting error when try to reverse by value
//		for(Map.Entry<Integer, book> m:map.entrySet())
//		{
//			System.out.println(m.getKey()+" book info:");
//			book b=m.getValue();
//			System.out.println(b.qnt+" "+b.year+" "+b.Name+" "+b.Auther);
//		}
//	}
//}
		
		
		
		
//		Map<Integer,String>map=new HashMap<Integer,String>();
//		map.put(1, "NK");
//		map.put(3, "PD");
//		map.put(7, "SD");
//		map.put(4, "SB");
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//		//map.entrySet().stream().sorted()
//		
//	}
//}
		
		
		//*****Important****?/
//		Map<Integer,String>map=new HashMap<Integer,String>();
//		map.put(1, "Smita");
//		map.put(2, "Geeta");
//		map.put(4, "Rupesh");
//		map.put(3, "Sahesh");
//		
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//	}
//}
	
	
	
//	HashMap<Integer,Student>map=new HashMap<Integer,Student>();	
//	Student s1=new Student(101,"Sandy");
//	Student s2=new Student(102,"Paddy");
//	Student s3=new Student(103,"Prathm");
//	
//	map.put(1,s1);
//	map.put(2,s2);
//	map.put(3, s3);
//	
//	for(Map.Entry<Integer,Student> m: map.entrySet())
//	{
//		Integer key= m.getKey();
//		Student s=m.getValue();
//		System.out.println(key+" "+"Student info:");
//		System.out.println(s.Rollno+" "+s.name);
//	}
//		
//	}
//}
	
	
		
//		Map<Integer,String> map=new HashMap<Integer, String>();
//		map.put(1, "Sammy");
//		map.put(2, "Samu");
//		map.put(3, "Sandy");
//		map.put(4, "Ani");
//		map.replace(2, "Samu","Samiksha");//replace by method
//		map.replaceAll((k,v)->"Ajay");//replace all
//		for(Map.Entry m:map.entrySet())
//		{
//			System.out.println(m.getKey()+"  "+m.getValue());
//		}
//	}
//}
	
	
	
		//******Calculate frequency of each element*****
//		int arr[]= {1,2,3,4,1,2,5,6};
//		Map<Integer,Integer>m=new HashMap<Integer,Integer>();
//		for(int i=0;i<arr.length;i++)
//		{
//			if(m.containsKey(arr[i]))
//			{
//				m.put(arr[i], m.get(arr[i]+1));
//				//System.out.println(m.get(arr[i]+1));
//			}
//			else
//			{
//				m.put(arr[i], 1);
//				System.out.println(m);
//			}
//		}
//		for(Map.Entry nw:m.entrySet())
//		{
//			System.out.println(nw.getKey()+" "+nw.getValue()+" ");
//		}
		
		
//		Map<Integer, String>m=new HashMap<Integer,String>();
//		m.put(1, "Varsha");
//		m.put(2, "Shwetal");
//		m.put(3, "Partiksha");
//		m.put(4, "Pratiksha");
//		System.out.println("Before Adding: ");
//		for(Map.Entry<Integer, String>m1:m.entrySet())
//		{
//			System.out.println(m1.getKey()+" "+m1.getValue()+" ");
//		}
//		m.putIfAbsent(5, "Pradnya");
//		System.out.println("After Adding: ");
//		for(Map.Entry m1:m.entrySet())
//		{
//		System.out.println(m1.getKey()+" "+m1.getValue()+" ");
//		}
//		Map<Integer,String>nm=new HashMap<Integer,String>();
//		nm.put(6, "Samiksha");
//		nm.putAll(m);
//		System.out.println("Added new one: ");
//		for(Map.Entry s:nm.entrySet())
//		{
//			System.out.println(s.getKey()+" "+s.getValue()+" ");
//		}


		
//		Map<Integer,String>map=new HashMap<Integer,String>();
//		map.put(1, "Hi");
//		map.put(2, "Hey");
//		map.put(3, "Sam");
//		System.out.println("Before adding: "+map);//{1=hi,2=hey}
//		map.putIfAbsent(4, "Deshmukh");
//		System.out.println("After adding: "+map);
//		System.out.println(map.get(2));//hey
//		for(Map.Entry<Integer, String> m: map.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue()+" ");//1 hi....2 hey...
//		}
//}

//}
