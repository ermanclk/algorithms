package javatrainers.labs;

public class Lab3Soru7 {

	public static void main(String[] args) {
		int[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int[] newIntegerArray = new int[integerArray.length];


		for (int i = 0; i < integerArray.length; i++) {
			newIntegerArray[i] = integerArray[i];
		}
		
		
		for (int i = 0; i < newIntegerArray.length; i++) {
			
			System.out.println(newIntegerArray[i]);
			
		}		
		
		
		
		

	}

}
