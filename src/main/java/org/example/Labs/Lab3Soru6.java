package javatrainers.labs;

public class Lab3Soru6 {

	public static void main(String[] args) {

		int[] integerArray = {25, 125, 68, 95, 6, 88, 34, 75, 44, 2, 8, 6};
		
		int highestValue = integerArray[0];
		int secondHighestValue = 0;

		
		
		
		for (int i = 1; i < integerArray.length; i++) {
			
			if (integerArray[i] >= highestValue) {
				secondHighestValue = highestValue;
				highestValue = integerArray[i];
			}else {
				if (integerArray[i] >= secondHighestValue) {
					secondHighestValue = integerArray[i];
				}
			}
			
		}
		
		System.out.printf("En Büyük Sayý %d - Ýkinci Büyük Sayý %d", highestValue, secondHighestValue).println();;
		
		
		
		
		
		
	}

}
