import java.io.*;
import java.util.Scanner;


class prime_no
{
	public static void main(String[] args) 
	{
		int n=2,input,counter=0,j=0,temp;
		System.out.println("Enter a number: ");
		Scanner cn= new Scanner(System.in);
		input=cn.nextInt();
		int a[]=new int[input+1];
		temp=input;

		while(input>1)
		{
			for(int i=1;i<n;i++)
			{
				if(n%i==0)
				{
					counter=counter+1;
				}
			}
			if(counter==1)
			{
				a[j]=n;
			}
			j++;
			counter=0;
			n++;
		}
		System.out.println("The generated numbers are: ");
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}

	
		}
}