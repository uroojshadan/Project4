/*Assignment

Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
Given N --- Print backward to 0.
(Ask user for a number and let's assume N is 5 so if the user input 5
– then the program should print: 5 4 3 2 1 0)

Ask the user for a word and then print each character out one by one.
Example: user enters: hello; your program will print out: h e l l o

 */

package javaAssignment4;

import java.util.Scanner;

public class Assignment4loops {

	public static void main(String[] args) {
		
		
		Scanner uI=new Scanner(System.in);//to take limit for printing first number series
		Scanner uI2=new Scanner(System.in);//to take limit to print second number series
		Scanner uI3=new Scanner(System.in);//to take a string input to display it character by character
		System.out.println("Enter a limit: ");
		int N=uI.nextInt();
		for(int i=0;i<=N;i=i+4)//to print 1 4 8 12 16 20...upto N
		{
			if(i==0) {
				System.out.print(i+1+" ");
				continue;
			}
			System.out.print(" ,"+i);
		}
		System.out.println();
	
		System.out.println("================================");
		
		System.out.println("Enter a number to print backwards pattern upto 0: ");
		int N2=uI2.nextInt();
		for(int j=N2;j>=0;j--)//printing backwards==>5 4 3 2 1 0
		{
			if(j==0){//condition to print commas in between the number series
			System.out.print(j+" ");
			}
			else {
				System.out.print(j+" ,");
			}}
		System.out.println();
		System.out.println("===================================");
		System.out.println("Enter a string: ");
		String a=uI3.nextLine();
		char [] b=a.toCharArray();
		for(int k=0;k<b.length;k++) {
			System.out.print(b[k]+" ");
		}
		
		System.out.println();
		
	
	}
}
