package javatrainers.labs;

public class Lab4Soru3 {



	// Function to demonstrate printing pattern
	public static void printTriagle(int n)
    {
		int piramidLength = n;
		for (int i = 0; i < piramidLength; i++) {

			for (int j = i; j < piramidLength - 1; j++) {
				System.out.print(" ");

			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");

			}

			System.out.println("");

		}
    }

	// Driver Function
	public static void main(String args[])
    {
        int n = 5;
        printTriagle(n);
    }
}

