package javaAssignment8;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicatedChar {

	public static void main(String[] args) {
		String str = "hello world";
		Set<Character> myC = new LinkedHashSet<Character>();
		Set<Character> myC1 = new LinkedHashSet<Character>();
		char[] c = str.toCharArray();
		for (char key : c) {
			if (myC.contains(key)) {
				myC1.add(key);// making a new set of repeated elements in the array-->l,o

			} else {
				myC.add(key);// adding the characters if myC does not already have them-->like
								// 'h','e','w','r''d'
			}
		}
		System.out.println(myC1);// printing out repeated characters (without duplicates)

	}
}
