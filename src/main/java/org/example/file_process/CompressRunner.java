package edu.etu.lab211;

public class CompressRunner {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("L�tfen aranacak kelimeyi giriniz: "); String searchWord =
		 * scanner.nextLine();
		 * System.out.println("L�tfen arat�lacak dosyan�n yolunu giriniz: "); String
		 * filePath = scanner.nextLine();
		 */
		String originalFilePath = "d:/text.txt";

		Compress compress = new Compress();

		compress.codeFile(originalFilePath);
		compress.decodeFile(originalFilePath);
	}

}
