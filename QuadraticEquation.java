// Accept integer values for a, b and c which are coefficients of quadratic equation.
// Find the solution of quadratic equation.

// x= [-b +- sqrt(b^2 - 4ac)]/2a

// a positive number inside the square root--> two distinct real-number solutions
//zero inside the square root-->one (repeated) real-number solution
//a negative number inside the square roo---> no real-number solutions

import java.io.*;
import java.util.Scanner;
import java.lang.Math;

class sol_type{
	double a, b,c;
	boolean isReal=false;

	public sol_type(double a,double  b,double c){
		double insideRoot= (b*b)- (4*a*c);  System.out.println("insideRoot: "+insideRoot);
		double outerRoot= Math.sqrt(insideRoot);  System.out.println("outerRoot: "+outerRoot);

		double root1=(-b+outerRoot)/(2*a);
		double root2=(-b-outerRoot)/(2*a); 

		if (insideRoot==0) {
			System.out.println("The solution is unique and Real. ")		;
				if (root1==0) {
					System.out.println("Solution1: "+root2);
					}
				else{System.out.println("Solution2: "+root1);}	


				}		
		else if (insideRoot!=0) {
			if (insideRoot>0){
				System.out.println("There are 2 distinct solution and are Real. ");	
				System.out.println("Solution1: "+root1);
				System.out.println("Solution2: "+root2);
			}
			else{
				System.out.println("No Real Solution. ");
				System.out.println("Solution1: "+root1);
				System.out.println("Solution2: "+root2);

			}
					
				}	
				
	}





}

class QuadraticEquation{
	public static void main(String[] args) {
		double x, y,z;
		Scanner reader=new Scanner(System.in);
		System.out.println("Please enter a value for the co-efficients a, b and c where a cannot be 0:  ");
		 x=reader.nextDouble();
		 y=reader.nextDouble();
		 z=reader.nextDouble();

		sol_type grace=new sol_type(x,y,z);
			
	}
}