package javatrainers.labs;

public class Lab1Soru2 {

	public static void main(String[] args) {

		int[] integerArray = { 5, 88, 69, 35, 76, 2, 14, 93 };

		int aranacakSayi = 88;
		boolean sayiArraydaVarMi = false;

		int i = 0;

		for (i = 0; i < integerArray.length; i++) {

			if (aranacakSayi == integerArray[i]) {
				sayiArraydaVarMi = true;
				break;
			}

		}

		if (sayiArraydaVarMi) {
			System.out.println(aranacakSayi + " sayýsý mevcut ve dizinin " + (i + 1) + ". elemanýdýr.");
		} else {
			System.out.println(aranacakSayi + " sayýsý mevcut deðil");
		}

	}

}
