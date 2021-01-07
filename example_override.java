import java.io.*;
import java.util.Scanner;

class superb
{
	int x;
	superb(int x)
	{
		this.x=x;
	}
	void display()
	{
		System.out.println("hello x: "+x);
	}
}

class sub extends superb
{
	int y;
	sub(int x, int y)
	{
		super(x);
		this.y=y;
	}
	void display()
	{
		super.display();
		System.out.println("hello x and y: "+x+" "+y);
	}
}

class example_override
{
	public static void main(String[] args) 
	{
		sub s1=new sub(100,200);
		s1.display();	
	}
}