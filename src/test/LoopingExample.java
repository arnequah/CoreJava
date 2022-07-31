package test;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		
		// till 10
		
		while(num<=10) {
			
			if(num==6) {
			
			//System.out.println(num);
			//num = num +1;
			//num ++;
			num = num+2;
			//break;
			continue;
		}
		
		System.out.println(num);
		num = num+2;

	}
		
		System.out.println("After While Loop");
		
		// for loop
		
		for(int index=1;index<=10;index++) {
			
			if(index==6) {
				continue;
			}
			
			System.out.println(index);
			
		}
		
		int[] array1 = {10,20,30,40,50,60};
		
		for(int num1:array1) {
			
			System.out.println(num1);
		}
		
		// Write the logic to print all the array values using normal for loop
		
		int[] array2 = {10,20,30,40,50,60};
		System.out.println(Arrays.toString(array2));
		
		int [] array3 = new int []{10,20,30,40,50,60};
		 for (int i = 0; i < array3.length; i++) {  
	            System.out.print(array3[i]);  
		 		}
	}
}
