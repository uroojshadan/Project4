package javaAssignment7One;

public class Class3 extends Class2 {//class3 is subclass of class 2
	public static void main(String[] args) {
		Class3 obj3=new Class3();
		System.out.println("In same package subclass(inheritance)");
		obj3.print5();
		obj3.print6();
		//obj3.print7();//cannot access private method in same package subclass(inheritance)
		obj3.print8();
	}
	

}
