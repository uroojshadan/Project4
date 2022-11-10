package javaAssignment4;

import java.util.Scanner;

public class Assignment5Palindrome {//A string is called a palindrome string if the reverse of that string 
									//is the same as the original string.

	public static void main(String[] args) {
				Scanner ui=new Scanner(System.in);//to take a String from user
				System.out.println("Enter a string to check if it is a palindrome or not: ");
				String s=ui.nextLine();
				Assignment5Palindrome obj=new Assignment5Palindrome();//object created to call non static method reverseString()
			
				if(s.equalsIgnoreCase(obj.reverseString(s))){//comparing entered string and reverse of string by 
					//invoking the method using object.
					System.out.println("The String "+s+" is Palindrome");
				}
				else{
					System.out.println("The string "+s+" is not a Palindrome");
					
				}
				
	}
	
	public String reverseString(String str) {//non static method reverseString()
		String rev="";//since we have string stored as character array we need to convert it 
		//to string so just concatenate it using + operator with empty string reverse.
		
		//char [] str1=str.toCharArray();- Another way of getting each char of string and storing it in character array.
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);//rev=rev+str1[i];
			/*for(int i=str1.length-1;i>=0;i--) {
				reverse=reverse+str1[i];//concatenating empty string with character array to make 
										//entire result string data type
				}*/
		}
		return rev;
		}
	
}

