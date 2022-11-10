package javaAssignment7Two;

import javaAssignment7One.Class1;

public class Class4 {
	public static void main(String[] args) {
		Class1 obj = new Class1();
		//obj.print1();//cannot access default method in a class of one package from a class in different package non subclass(no inheritance)
		System.out.println("In different package non subclass(no inheritance)");
		obj.print2();//only public method can be accessed in different package non subclass(no inheritance)
		//obj.print3();//private method cannot be accessed in a different package non subclass( no inheritance)
		//obj.print4();//protected ethod cannot be accessed in a different package non subclass(no inheritance)

	}
}
