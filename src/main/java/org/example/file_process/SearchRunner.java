package edu.etu.lab211;

public class SearchRunner {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("L�tfen aranacak kelimeyi giriniz: "); String searchWord =
		 * scanner.nextLine();
		 * System.out.println("L�tfen arat�lacak dosyan�n yolunu giriniz: "); String
		 * filePath = scanner.nextLine();
		 */
		String searchWord = "derede";
		String filePath = "d:/test.txt";

		Search search = new Search();
		search.find(filePath, searchWord);

	}

}
