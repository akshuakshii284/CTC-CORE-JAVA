package technoservectcbatch09;

import java.util.Scanner;


public class string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string1: ");
		System.out.println("Enter the string2: ");
		String A =sc.nextLine();
		String B=sc.nextLine();
		int sum=0;
		sum=A.length()+B.length();
		System.out.println("The sum of the lengths is "+sum);
		if(A.compareTo(B)>0)
		{
			System.out.println("Yes");
			
}
		else
		{
			System.out.println("No");
		}
	System.out.println(A.substring(0,1).toUpperCase()+A.substring(1,A.length())+" "+B.substring(0,1).toUpperCase()+B.substring(1,B.length()));
	}
}
		

