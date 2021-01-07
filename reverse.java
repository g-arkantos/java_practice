import java.io.*;
import java.util.Scanner;

class reverse
{
	public static void main(String[] args) {
		int n,temp,digit,result=0;
		System.out.println("Enter a number: ");
		Scanner cn=new Scanner(System.in);
		n=cn.nextInt();

		temp=n;
		while(temp!=0)
		{
			result=result*10;
			digit=temp%10;
			result=result+digit;
			temp=temp/10;



		}
		System.out.println("The reverse of the number "+n+" is: "+result);

		}	
}//456--60,45--