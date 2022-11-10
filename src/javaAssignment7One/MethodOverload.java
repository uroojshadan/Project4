package javaAssignment7One;

public class MethodOverload {

	public static void main(String[] args) {
		MethodOverload m=new MethodOverload();
		System.out.println("Sum of two numbers: " +m.sum(1, 2));
		System.out.println("Sum of three Numbers: "+m.sum(3,4,6));
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(int a,int b,int c) {
		return a+b+c;
	}
}
