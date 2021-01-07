import java.io.*;
import java.util.Scanner;

// understanding sub class (using the keyword 'extends')

class car //lets say, the universal class here
{
	public car() 
	{
		System.out.println("class vehicle");
	}
	public void vehicleType()
	{
		System.out.println("Type of vehicle: Four Wheeler");
	}
}

class maruti extends car // here, class maruti is the subclass of the bigger class CAR
{
	public maruti()
	{
		System.out.println("class maruti");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti");
	}
	public void speed()
	{
		System.out.println("Max speed: 90kmph");
	}
} 

public class example_sub_class_maruti extends maruti // here, class maruti800 is the subclass of class maruti
{
	public example_sub_class_maruti()
	{
		System.out.println("class maruti800");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti800");
	}
	public void speed()
	{
		System.out.println("Max speed: 80kmph");
	}
		public static void main(String[] args) {
		maruti800 newObj=new maruti800();
		newObj.vehicleType();
		newObj.brand();
		newObj.speed();

	}
}


