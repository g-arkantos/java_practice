import java.io.*;
import java.util.Scanner;

class calculator
{
	public static void main(String[] args) 
	{
		int x, y;
		System.out.println(" Enter two numbers: ");
		Scanner cn=new Scanner(System.in);
		x=cn.nextInt();
		y=cn.nextInt();
		System.out.println(" Addition (x+y): "+(x+y));
		System.out.println(" Subtraction (x-y): "+(x-y));
		System.out.println(" Multyiplication (x*y): "+(x*y));
		System.out.println(" Division (x/y): "+(x/y));
	}
}