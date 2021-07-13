package javatrainers.labs;

public class Lab1Soru3 {

	public static void main(String[] args) {

		int[] integerArray = { 5, 88, 69, 35, 76, 2, 14, 93 };

		for (int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + ",");
		}
		System.out.println("\n\n");
		boolean siralandiMi = false;
		while (!siralandiMi) {
			siralandiMi = true;
			for (int i = 0; i < (integerArray.length - 1); i++) {
				if (integerArray[i] > integerArray[i + 1]) {
					int tempInt = integerArray[i + 1];
					integerArray[i + 1] = integerArray[i];
					integerArray[i] = tempInt;
					siralandiMi = false;
				}

			}
		}

		for (int i = 0; i < integerArray.length; i++) {
			System.out.print(integerArray[i] + ",");
		}

	}

}
