package technoservebatch009;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;



public class Singleton {
	private static Singleton instance;

	private  Singleton() {}
	public  String str;
	public static Singleton getSingleinstance()
	{
		if(instance==null)
		{
		instance=new Singleton();
	}
	return instance;
}
}
