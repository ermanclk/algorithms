package javatrainers.labs;

public class Lab5Soru1 {

	public static void main(String[] args) {
	
		int numCount = 6;
		for (int i = 1; i <= numCount; i++) {
			
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = i; j <= numCount; j++) {
				
				System.out.print(j + " ");
				
			}
				
			System.out.println("");
		}

	}

}
