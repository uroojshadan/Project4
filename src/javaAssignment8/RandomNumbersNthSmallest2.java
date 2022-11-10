package javaAssignment8;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumbersNthSmallest2 {

	public static void main(String[] args) {
		Set<Integer> myData=new TreeSet<Integer>();//because it is sorted-->if not using treeSet 
		//and using linked Hash set then do arrays.sort(myData); 
		//and print out element at n-1 since array index starts at 0
		Random rn=new Random();
		int min=100;
		int max=1000;
		while(myData.size()!=5)
		{
			myData.add((rn.nextInt(max-min)+min)+1);
			
			
		}
		System.out.println(myData);
		Object[] myDataArr=myData.toArray();
		
		System.out.println("Enter the n to get Nth smallest no: ");
		Scanner ui=new Scanner(System.in);
		int N=ui.nextInt();
		System.out.println(myDataArr[N-1]);
		
		}

}
