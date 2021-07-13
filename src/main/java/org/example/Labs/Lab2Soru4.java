package javatrainers.labs;

public class Lab2Soru4 {
	
	public static void main(String[] args) {

		int[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int loopCount = integerArray.length / 2;
		
		for (int i = 0; i < loopCount; i++) {
			int tempVal = integerArray[i];
			integerArray[i] = integerArray[integerArray.length - i - 1];
			integerArray[integerArray.length - i - 1] = tempVal;
		}
		
		for (int i = 0; i < integerArray.length; i++) {
			
			System.out.println(integerArray[i]);
			
		}
	}

}
