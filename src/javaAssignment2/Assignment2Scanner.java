package javaAssignment2;

import java.util.Scanner;

public class Assignment2Scanner {

	public static void main(String[] args) {
		
		
				Scanner uI1=new Scanner(System.in);//for non primitive data type
				Scanner uI2= new Scanner(System.in);//for primitive data type
			
				System.out.println("What is your name?");
				String name=uI1.nextLine();
			
				
				System.out.println("How old are you?");
				int age=uI2.nextInt();
				
				
				System.out.println("What is your gender?");
				String gender=uI1.nextLine();
				
				System.out.println("Where do you work?");
				String companyName=uI1.nextLine();
				

				System.out.println("Where do you live?");
				String location=uI1.nextLine();
				
				System.out.println("what is your jobRole?");
				String jobRole=uI1.nextLine();
				
				
				System.out.println("Where are you originally from?");
				String location2=uI1.nextLine();
				
				System.out.println("What is your salary?");
				double salary=uI2.nextDouble();
				
				System.out.println("how much raise do u get?");
				double raise=uI2.nextDouble();
			
				double totalSalary=salary+raise;
				
				System.out.println("My name is "+name+". I am "+age+" years old " +gender+
						". I work at "+companyName+" as " +jobRole+". I currently live in "+location+
						". I am originally from "+location2+". I make "+salary+" dollars. "
								+ "I will get "+raise+
						" dollars as annual raise so my total salary would be "+totalSalary+" dollars next year.");
				

			}

		


	}


