package javaAssignment7One;

public class SuperKeywordAndOverrideC extends SuperKeywordAndOverrideP {
	String color="blue";
	public static void main(String[] args) {

		SuperKeywordAndOverrideC c = new SuperKeywordAndOverrideC();
		SuperKeywordAndOverrideP p = new SuperKeywordAndOverrideC();
		p.sum(10,5);
		c.printColor();
		c.print();
	}

	public void sum(int a, int b) {
		super.sum(a, b);
		int res=a+b;
		System.out.println("SubClass :"+res);
		
		
	}
	public void printColor() {
		System.out.println("sub Class: "+color);
		System.out.println("Super Class: "+super.color);
	}
	public void print() {//print() in both Super class and subclass-->override-->the print() of subclass overrides the super class print()
		System.out.println("Hello in Child/SubClass class");
		}


}

