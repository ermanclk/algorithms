package javatrainers.labs;

public class Lab2Soru5 {

	public static void main(String[] args) {
		int[] integerArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		int[] newIntegerArray = new int[integerArray.length - 1];
		
		int deletedItem = 6;
		
		boolean sayiBulunduMu = false;
		for (int i = 0; i < integerArray.length; i++) {
			if(integerArray[i] == deletedItem) {
				sayiBulunduMu = true;
				continue;

			}else {
				if (sayiBulunduMu) {
					newIntegerArray[i-1] = integerArray[i];
				}else {
					newIntegerArray[i] = integerArray[i];
				}
			}
			
		}
		
		
		for (int i = 0; i < newIntegerArray.length; i++) {
			
			System.out.println(newIntegerArray[i]);
			
		}		
		

	}

}
