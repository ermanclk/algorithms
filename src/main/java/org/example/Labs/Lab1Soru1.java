package javatrainers.labs;

import java.math.BigDecimal;

public class Lab1Soru1 {

	public static void main(String[] args) {

		int[] integerArray = { 10, 2, 58, 62, 46 };

		int toplam = 0;
		for (int i = 0; i < integerArray.length; i++) {
			toplam += integerArray[i];

		}
		BigDecimal ortalama = new BigDecimal(toplam).divide(new BigDecimal(integerArray.length));

		System.out.println(ortalama);

	}

}
