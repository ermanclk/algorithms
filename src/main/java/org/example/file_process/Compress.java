package edu.etu.lab211;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Compress {

	public String codedFilePath(String originalFilePath) {

		int dotPlace = originalFilePath.indexOf(".");
		String outputFileName = originalFilePath.substring(0, dotPlace) + "_coded"
				+ originalFilePath.substring(dotPlace, originalFilePath.length());
		return outputFileName;
	}

	public void printFile(String filePath) {
		File inputFile = new File(filePath);

		try {
			Scanner scanner = new Scanner(inputFile);
			while (scanner.hasNextLine()) {
				String newLine = scanner.nextLine();
				System.out.println(newLine);
			}
			scanner.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public void codeFile(String originalFilePath) {
		String codedFilePath = this.codedFilePath(originalFilePath);
		this.printFile(originalFilePath);
		File inputFile = new File(originalFilePath);
		File outputFile = new File(codedFilePath);

		try {
			Scanner scanner = new Scanner(inputFile);
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));
			while (scanner.hasNextLine()) {
				String newLine = scanner.nextLine();
				String writeLine = "";
				for (int i = 0; i < newLine.length(); i++) {
					String readChar = newLine.substring(i, i + 1);
					String codedString = this.returnLetterCode(readChar);
					if (codedString != null) {
						writeLine = writeLine + codedString;
					}
				}
				bufferedWriter.write(writeLine + "\n");
			}
			bufferedWriter.close();
			scanner.close();
			this.printFile(codedFilePath);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String returnLetterCode(String letter) {
		if (letter.equals("a")) {
			return "1";
		}
		if (letter.equals("b")) {
			return "000";
		}
		if (letter.equals("c")) {
			return "001";
		}
		if (letter.equals("d")) {
			return "010";
		}
		if (letter.equals("e")) {
			return "0110";
		}
		if (letter.equals("f")) {
			return "0111";
		}
		return null;

	}

	public void decodeFile(String originalFilePath) {
		String codedFilePath = this.codedFilePath(originalFilePath);
		File inputFile = new File(codedFilePath);

		try {
			Scanner scanner = new Scanner(inputFile);
			while (scanner.hasNextLine()) {
				String newLine = scanner.nextLine();
				String writeLine = this.decodeLine(newLine);
				System.out.println(writeLine);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	public String decodeLine(String readLine) {
		int i = 0;
		String decodeString = "";
		String decodedLine = "";
		while (i < readLine.length()) {
			String readChar = readLine.substring(i, i + 1);
			decodeString = decodeString + readChar;
			if (decodeString.equals("1")) {
				decodedLine = decodedLine + "a";
				decodeString = "";
			} else if (decodeString.equals("000")) {
				decodedLine = decodedLine + "b";
				decodeString = "";
			} else if (decodeString.equals("001")) {
				decodedLine = decodedLine + "c";
				decodeString = "";
			} else if (decodeString.equals("010")) {
				decodedLine = decodedLine + "d";
				decodeString = "";
			} else if (decodeString.equals("0110")) {
				decodedLine = decodedLine + "e";
				decodeString = "";
			} else if (decodeString.equals("0111")) {
				decodedLine = decodedLine + "f";
				decodeString = "";
			}
			i++;

		}
		return decodedLine;

	}

}
