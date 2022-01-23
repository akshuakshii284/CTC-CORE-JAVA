package technoservectcb09;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string1: ");//eat//
		String A=sc.next();
		System.out.println("enter the string2: ");//cat//
		String B=sc.next();
		char ch1[]=new char[A.length()];
		char ch2[]=new char[B.length()];
	
		if(A.length()!=B.length())
		{
		
			System.out.println("the string is not anagram");
		}
		else 
		{
		    A.toLowerCase();
		    B.toLowerCase();
		    ch1=A.toCharArray();
		    ch2=B.toCharArray();
		     Arrays.sort(ch1);//sorting arrays in alphbatical order
		     Arrays.sort(ch2);
		
		     
		    A=new String(ch1);B=new String(ch2);//constructor by passing string as parameter//
	        System.out.println(A);
	        if(Arrays.equals(ch1, ch2))
	        {
	           System.out.println("the string is anagram");
		    }
	        else {
	        	System.out.println("not anagram");
	            }
	        	
		}

	}
}


