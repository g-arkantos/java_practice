import java.io.*;
import java.util.Scanner;

class calculator
{
	int a,b,c;

//-----------------------------------------------	
	public int  add(int a, int b) // addition method
	{
		return a+b;
	}
	public int add(int a, int b, int c) // addition methoad overloaded
	{
		return a+b+c;
	}
//-----------------------------------------------
	public int sub(int a, int b) // subtraction method
	{
		return a-b;
	}
		public int sub(int a, int b, int c) // subtraction methoad overloaded
	{
		return a-b-c;
	}
//-----------------------------------------------
	public int mul(int a, int b) // multiply method
	{
		return a*b;
	}
		public int mul(int a, int b, int c) // multiply methoad overloaded
	{
		return a*b*c;
	}
//-----------------------------------------------
	public double div(int a, int b) // Divition method
	{
		return a/b;
	}
		public double div(int a, int b, int c) // Divition methoad overloaded
	{
		return a/b/c;
	}
}	
//-----------------------------------------------


class simple_calculator{
	public static void main(String[] args) {
		int a,b,c;
		
	
	System.out.println( "Enter 2 or 3 number: ");
	Scanner reader=new Scanner(System.in);
	a=reader.nextInt();
	b=reader.nextInt();
	c=reader.nextInt();
	calculator operation=new calculator();
	System.out.println("Sum: "+ operation.add(a,b,c) +
		"  subtraction: "+ operation.sub(a,b,c)+
		" multiply: "+ operation.mul(a,b,c)+
	" Divition: "+ operation.div(a,b,c));
}
}
