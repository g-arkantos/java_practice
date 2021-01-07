import java.io.*;
import java.util.Scanner;

class armstrong
{
	public static void main(String[] args) {
		int n, temp,digit,result=0;
		System.out.println("Enter a number: ");
		Scanner cn= new Scanner(System.in);
		n=cn.nextInt();
		temp=n;
		while(temp!=0)
		{
			digit=temp%10;
			result=result+(digit*digit*digit);
			temp=temp/10;
		}
		if(result==n)
		{
			System.out.println("The number "+n+" is Armstrong");
		}
		else{
			System.out.println("The number "+n+" is not Armstrong");
		}
	}
}