package edu.etu.lab211;

public class CompressRunner {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Lütfen aranacak kelimeyi giriniz: "); String searchWord =
		 * scanner.nextLine();
		 * System.out.println("Lütfen aratýlacak dosyanýn yolunu giriniz: "); String
		 * filePath = scanner.nextLine();
		 */
		String originalFilePath = "d:/text.txt";

		Compress compress = new Compress();

		compress.codeFile(originalFilePath);
		compress.decodeFile(originalFilePath);
	}

}
