//Generate 500 RANDOM numbers, and find the Nth smallest number (range from 100 – 1000)

package javaAssignment8;

import java.util.Random;
import java.util.Scanner;

public class RandomNumbersNthSmallestNo {

	public static void main(String[] args) {
		int min = 100;
		int max = 1000;
		Random rn = new Random();
		int[] randomArr = new int[500];
		System.out.println("The random numbers between 100 and 1000 for 500 times are: ");
		for (int i = 0; i <randomArr.length; i++) {
			randomArr[i] = rn.nextInt(max - min + 1) + min;
			System.out.println(randomArr[i]);
		}
		Scanner ui=new Scanner(System.in);
		System.out.println("Enter n to find the nth smallest no: ");
		int n=ui.nextInt();
		int index;
		for(int i=0;i<randomArr.length;i++) {//sorting the array
			index=i;
			for(int j=i;j<=randomArr.length-1;j++) {
				if(randomArr[j]<randomArr[index]) {//to find largest nth number randomArr[j]>randomArr[index]
					index=j;
				
				}
			}
			int temp=randomArr[i];
			randomArr[i]=randomArr[index];
			randomArr[index]=randomArr[i];
			
		}
		System.out.println("The nth smallest number is :"+randomArr[n-1]);
	    
	   
	    
	  }

	}

