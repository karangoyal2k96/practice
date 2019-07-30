package hello;

import java.util.Scanner;

public class hello {

	
	static public int add(int a, int b) {
		return a+b;
	}
	
	//subtract
	static public int subtract(int a, int b) {
		return a-b;
	}
	
	static public int multiply(int a, int b) {
		return a*b;
	}
	
	//divide
	static public int divide(int a, int b) {
		return a/b;
	}	
	
	
	public static void main(String args[])

		{

		int x, y, z,z1,z2,z3;
		System.out.println("Enter two integers to calculate their sum");


		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		
		z = add(x,y);  
		z1=subtract(x,y);
		z2=multiply(x,y);
		z3=divide(x,y);


		System.out.println("Sum of the integers = " + z);
		System.out.println("Sub of the integers = " + z1);
		System.out.println("Multiply of the integers = " + z2);
		System.out.println("Divide of the integers = " + z3);
  }

	
};


