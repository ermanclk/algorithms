package javatrainers.labs;

public class Lab4Soru2 {

	public static void main(String[] args) {

		int piramidLength = 5;
		for (int i = 0; i < piramidLength; i++) {

			for (int j = i; j < piramidLength - 1; j++) {
				System.out.print("  ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");

			}

			System.out.println("");

		}

	}

}
