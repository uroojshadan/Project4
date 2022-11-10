package javaAssignment5;

import java.util.Scanner;

public class Assignment5EvenOdd {
	public static void main(String [] ars) {
		Scanner ui=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int N=ui.nextInt();
		if(N%2==0) {//A number that is divisible by 2 and generates a remainder of 0 
					//is called an even number.
					//Use modulo(%) operator to get remainder
			System.out.println(N+" is even");
		}
		else {
			System.out.println(N+" is odd");
		}
		
	}

}
