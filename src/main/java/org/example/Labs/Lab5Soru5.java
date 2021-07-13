package javatrainers.labs;

public class Lab5Soru5 {

	public static void main(String[] args) {
		
		String toReverse = "1234567890";
		
		String reverse = "";
		
		for (int i = toReverse.length() - 1; i >= 0 ; i--) {
			reverse = reverse + toReverse.charAt(i);
		}
		
		System.out.println(reverse);
		

	}

}
