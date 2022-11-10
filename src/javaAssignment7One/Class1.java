package javaAssignment7One;

public class Class1 {

	public static void main(String[] args) {
		Class1 obj1=new Class1();
		System.out.println("All access Modifiers are accessible from within the same class");
		obj1.print1();
		obj1.print2();
		obj1.print3();
		obj1.print4();
		System.out.println();
		System.out.println();
		Class2 obj2=new Class2();
		System.out.println("In same package non subclasss(no inheritance)");
		obj2.print5();
		obj2.print6();
		//obj2.print7();//private access modifier cannot be accessed outside the class
		obj2.print8();
		

	}
	void print1() {
		System.out.println("Default Access Modifier method ");
	}
	public void print2() {
		System.out.println("Public Access Modifier method  ");
	}
	private void print3() {
		System.out.println("Private Access Modifier method ");
	}
	protected void print4() {
		System.out.println("Protected Access Modifier method ");
	}
}
