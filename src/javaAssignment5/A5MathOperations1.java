package javaAssignment5;

public class A5MathOperations1 {//no main() since we are going to call these methods 
								//in A5MathOperations2 class
	/*Calling static methods: Static methods can be called by using className.methodName() or 
	simply methodName()if they are being called in the same class in which they exist.
	Calling non static methods: In order to call these methods we need to create an object of the class 
	in which the exist and call them using this object as objectName.methodName()*/
	
	//To allow operations of decimals all the methods return type and arguments are take as double.
	
	public static double add(double a,double b)//static method with return type double and 2 double arguments
	{												
		return a+b;
		
	}
	public static double subtract(double a,double b) {//static method with return type double and 2 double arguments
		
		return a-b;
	}
	public double multiply(double a,double b) {//non static method with return type double and 2 double arguments
		
		return a*b;
	}
	public double divide(double a,double b) {//non static method with return type double and 2 double arguments
		return a/b;
	}
}


