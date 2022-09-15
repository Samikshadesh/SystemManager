package collection;
import AdvancedConcept.*;
import java.util.*;
public class TreeMapEx {

	public static void main(String[] args) {
		Map<Integer,book>map=new TreeMap<Integer,book>();
		book s1=new book(100,2012l,"Niki","Stepin");
		book s2=new book(120,2042l,"Nik","Stepinkk");
		book s3=new book(102,2002l,"Narayan","Stepink");
		
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		for(Map.Entry m:map.entrySet()) 
		{
			System.out.println(m.getKey());
			book s=(book) m.getValue();
			System.out.println(s.qnt+" "+s.year+" "+s.Name+" "+s.Auther+" ");
		}
		
	}
}


//	Map<Integer,String>map=new TreeMap<Integer,String>();	
//	map.put(1,"Hi");
//	map.put(3, "Key");
//	map.put(2, "hello");
//	map.put(6, "Hay");
//	System.out.println(((TreeMap<Integer, String>) map).descendingMap());//descending order 
//	System.out.println(((TreeMap<Integer, String>) map).headMap(2,true));//2 to below
//	System.out.println(((TreeMap<Integer, String>) map).tailMap(2,true));//2 to above
//	System.out.println(((TreeMap<Integer, String>) map).subMap(2,true, 6,true));//between
//	for(Map.Entry m:map.entrySet())
//	{
//		System.out.println(m.getKey()+" "+m.getValue());
//		//System.outprintln(m.rever)
//	}
//		
//	}
//}
		
		
		
		
//		Map<Integer, String>map=new TreeMap<Integer, String>();
//		map.put(1, "Hello");//Ascending order
//		map.put(2, "Hey");
//		map.put(4,"hii");
//		map.put(3, "helo");
//		for(Map.Entry<Integer, String>m:map.entrySet())
//		{
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
//	}
//
//}
