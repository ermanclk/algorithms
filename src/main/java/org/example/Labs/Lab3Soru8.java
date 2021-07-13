package javatrainers.labs;


public class Lab3Soru8 {

	public static void main(String[] args) {
		
		
		int[] randomIntegerArray = new int[100];
		
		for (int i = 0; i < randomIntegerArray.length; i++) {
			int a = (int) (Math.random()*1000);
			randomIntegerArray[i] = a;
		}

		for (int i = 0; i < randomIntegerArray.length; i++) {
			System.out.print(randomIntegerArray[i]+ ", ");
		}


	}

}
