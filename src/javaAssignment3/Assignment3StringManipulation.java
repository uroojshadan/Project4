/*Assignment:

Ask the USER for a string (it should print “Please enter a String:”)
assume the user enters “hello”
Convert that string to all upper case and print it (it should print “HELLO”)
Print the length of that string (it should print 5)
Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
Give the last char of the string (it should print “Z”)
Concatenate the string from step 1 with string "Test" (it should print “hello Test”)*/

package javaAssignment3;

import java.util.Scanner;

public class Assignment3StringManipulation {

	public static void main(String[] args) {
		
		Scanner uI=new Scanner(System.in);
		System.out.println("Enter a String:");
		String input=uI.nextLine();
		
		String input2=input.toUpperCase();//using toUpperCase()in String class
		System.out.println("The string: "+input+" in upper case is :"+input2);
		
		System.out.println("The length of "+input+" is :"+input.length());//using length() in String class to return integer value i.e length of string
		
		input2=input2.replace('O', 'Z');//using replace() in class String to replace old character with new character. 
		//It takes 2 input arguments and returns the manipulated string
		System.out.println("Replacing O with Z :"+input2);
		
		System.out.println("The last character of"+input2+" string is: "+input2.charAt(input2.length()-1));//printing out last character which 
		//is the character at length()-1 position ,since index of a string starts at 0 and length starts at 1.
		
		String input3=" Test";
		System.out.println("String concatenation: "+input.concat(input3));//using concat() in String class which puts two strings together.
		//It takes String input argument to be concatenated and returns the concatenated string.
	}

}

















/*Assignment:

Ask the USER for a string (it should print “Please enter a String:”)
assume the user enters “hello”
Convert that string to all uppercase and print it (it should print “HELLO”)
Print the length of that string (it should print 5)
Replace ‘O’ with ‘Z’ (it should print “HELLZ”)
Give the last char of the string (it should print “Z”)
Concatenate the string from step 1 with string "Test" (it should print “hello Test”)*/