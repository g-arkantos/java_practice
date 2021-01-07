import java.io.*;
import java.util.Scanner;


class find_prime
{
	public static void main(String[] args) {
		int n,temp,counter=0;
		System.out.println("Enter a number: ");
		Scanner cn= new Scanner(System.in);
		n=cn.nextInt();
		temp=n;

		for(int i=2;i<n;i++)
		{	
			if(n%i==0)
			{
			counter=counter+1;
			}
		}
		if (counter==0)
		{
			System.out.println("The number "+n+" is a prime number. ");
		}
		else
		{
			System.out.println("The number "+n+" is not a prime number. ");
		}
	}
}