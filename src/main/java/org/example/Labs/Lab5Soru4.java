package javatrainers.labs;

public class Lab5Soru4 {

	public static void main(String[] args) {
		
		
		int counter = 1;
		int numCount = 5;
		for (int i = 1; i <= numCount; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}

	}

}
