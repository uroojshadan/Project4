/*Create two java classes (ClassOne.java, ClassTwo.java):
One with the main method (ClassOne.java)
One without the main method (ClassTwo.java)
Create a Constructor Chain inside the ClassTwo.java
Create object in ClassOne.java to invoke the constructor chain*/

package javaAssignment6;



public class ClassOne {

	public static void main(String[] args) {
		
		ClassTwo b=new ClassTwo(6,"Hello");//calling parameterized constructor and demonstrates chaining.
		

	}

}
