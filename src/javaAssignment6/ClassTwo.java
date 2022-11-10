package javaAssignment6;

public class ClassTwo {
	public ClassTwo() {//constructor of class ClassTwo-->(i)non static (ii)no return type (iii)same name as class name
	
		System.out.println("Default constructor");
	}
	public ClassTwo(int a) {//constructor chaining using this()-->from constructor 3 to constructor  2 to constructor 1
		//this keyword :(i)can be used only in non static environment
		//(ii)has to be the first line in the method body/constructor body.
		//execution from 3 2 1
		this();
		System.out.println("parameterized constructor with int a "+a);
	}
	public ClassTwo(int a, String b){
		this(a);//this means className
		System.out.println("parameterized constructor with int a and string b "+a+" "+b);
	}

}
