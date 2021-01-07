import java.io.*;
import java.util.Scanner;

class factorial
{
	public static void main(String[] args) {
		int n,fact=1;
		System.out.println("Enter a number: ");
		Scanner cn=new Scanner(System.in);
		n=cn.nextInt();
		for(int i=1; i<= n; i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of "+ n +"is: " +fact);
	}






}