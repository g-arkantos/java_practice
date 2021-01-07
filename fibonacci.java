import java.io.*;
import java.util.Scanner;

class fibonacci
{
	public static void main(String[] args) {
		int n,a=0,b=1,c=0;
		System.out.println("Enter a number here: ");
		Scanner cn=new Scanner(System.in);
		n=cn.nextInt();
		for(int i=0;i<n;i++)
		{
			c=a+b;
			b=a;
			a=c;
			System.out.println("Series is: "+c);
		}
	}
}