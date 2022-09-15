package BasicJavaPrograms;

import java.util.Scanner;
public class LeafYear {
	public static void main(String args[])
	{
		int sum =0;
		int n,Newword;
		Scanner sc=new Scanner(System.in);
		System.out.println("Pallindrome String");
		int Name=sc.nextInt();
	   Newword=Name;
		sc.close();
		while(Name>0) 
		{
			n=Name%10;
			
			sum=sum*10+n;
			Name=Name / 10;
			System.out.println(sum);
		}
		if(Newword==sum)
		{
			System.out.println("String is pallindrome");
		}
		else {
			System.out.println("String is not pallindrome");
		}
	
	}

}
