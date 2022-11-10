package javaAssignment7Two;

import javaAssignment7One.Class1;

public class Class5 extends Class1{
 public static void main(String[] args) {
	Class5 obj5=new Class5();
	//obj5.print1();//cannot access default method in different package sub class(inheritance)
	System.out.println("In different package subclass(inheritance)");
	obj5.print2();//can access public method in different package subclass(inheritance)
	//obj5.print3();//cannot access private method different package subclass(inheritance)
	obj5.print4();//cannot access protected method different package subclass(inheritance)
}
}
