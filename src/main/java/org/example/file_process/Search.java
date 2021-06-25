package edu.etu.lab211;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {

	public void find(String filePath, String searchWord) {
		File file = new File(filePath);

		Scanner in = null;
		int lineCount = 1;
		try {
			in = new Scanner(file);

			while (in.hasNextLine()) {
				String newLine = in.nextLine();
				String[] wordsInTheLine = newLine.split(" ");
				for (int i = 0; i < wordsInTheLine.length; i++) {
					if (wordsInTheLine[i].equals(searchWord)) {
						if (i == 0) {
							System.out.println(lineCount + ": " + wordsInTheLine[i] + " " + wordsInTheLine[i + 1]);
						} else if (i == wordsInTheLine.length - 1) {
							System.out.println(lineCount + ": " + wordsInTheLine[i - 1] + " " + wordsInTheLine[i]);

						} else {
							System.out.println(lineCount + ": " + wordsInTheLine[i - 1] + " " + wordsInTheLine[i] + " "
									+ wordsInTheLine[i + 1]);

						}
					}

				}
				lineCount++;
			}
			in.close();

		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}


	}

}
