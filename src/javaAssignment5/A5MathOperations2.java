package javaAssignment5;

import java.util.Scanner;

public class A5MathOperations2 {
	
	public static void main(String[] args) {
		
		UserSelection();//calling non static method in main() by using methodName() 
		//since it belongs to same class in which it is being called.
		//we can also call it using className.methodName();
		//A5MathOperations2.UserSelection();
	}

		

		public static void UserSelection()
		{
			Scanner op1=new Scanner(System.in);//to take a first number from user
			Scanner op2=new Scanner(System.in);//to take second number from user
			System.out.println("Enter first number: ");
			 double x=op1.nextDouble();
			System.out.println("Enter second number: ");
			 double y=op2.nextDouble();
			Scanner operation=new Scanner(System.in);//to enter which operation user wants to 
													 //perform on the numbers
			System.out.println("Enter the operation to be performed- Choices are ADD,SUB,MULTI,DIV: ");
			String op=operation.nextLine();
			
			A5MathOperations1 choice=new A5MathOperations1();//object creation to call non static methods 
			 												//in A5MathOperations1 Class
			
			 switch(op.toUpperCase()) {//if user enters operation in lower case 
			 						   //it gets converted to upper case 
			 						   //since case values are upper case.
			 	case "ADD":
				 System.out.println(x+"+"+y+"="+A5MathOperations1.add(x,y ));
				 break;// to end processing of a particular case.
				 //Without break , the program continues to the next case, executing the statements until 
				 //a break or the end of the statement is reached.
				case "SUB":
					System.out.println(x+"-"+y+"="+A5MathOperations1.subtract(x,y ));
					break;
				case "MULTI":
					System.out.println(x+"*"+y+"="+choice.multiply(x, y));//calling non static method multiply() 
					//using object choice of class A5MathOperations1 in which this method exists
					break;
				case "DIV":
					if(y==0) {
						System.out.println("Cannot Divide by 0");
					}
					else {
					System.out.println(x+"/"+y+"="+choice.divide(x, y));//calling non static method divide() 
					//using object choice of class A5MathOperations1 in which this method exists
					}
					break;
					
				default:
					System.out.println("Invalid Operation");
					
			 }
				 
			 
		
		}
		
	}

