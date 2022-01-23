package technoserveCTCBATCH009;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
	System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String B = sc.next();
		
		StringBuffer sb = new StringBuffer(B);
		for(int i=0;i<B.length();i++)
		{
			char ch=B.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				ch=(char)((int)ch+32);// convert the lower case to upper case//
				sb.setCharAt(i, ch);
			}
			else
			{
				ch=(char)((int)ch-32);//upper case to lower case //
				sb.setCharAt(i, ch);
			}
		 }
	
		System.out.println("the toggle string is : ");
		
		System.out.println(sb);
	
			}

		


	}


