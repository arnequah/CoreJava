package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1 = {10,20,30,40,50,60};
		
		System.out.println("Total numbers are " + array1.length);
		System.out.println("The second num is " + array1[1]);
		System.out.println("Total numbers are " + array1[array1.length -1]);
		
		String[] array2 = {"abc","pqr","xyz"};
		System.out.println("The second value is " + array2[1]);
		
		String str1 = "Clean World Green World";
		String[] array3 = str1.split(" "); // {"Clean","World","Green","World"}
		System.out.println("The first word is " + array3[0]);
		System.out.println("The last word is " + array3[array3.length -1]);

	}

}
