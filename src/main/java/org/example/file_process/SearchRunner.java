package edu.etu.lab211;

public class SearchRunner {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Lütfen aranacak kelimeyi giriniz: "); String searchWord =
		 * scanner.nextLine();
		 * System.out.println("Lütfen aratýlacak dosyanýn yolunu giriniz: "); String
		 * filePath = scanner.nextLine();
		 */
		String searchWord = "derede";
		String filePath = "d:/test.txt";

		Search search = new Search();
		search.find(filePath, searchWord);

	}

}
