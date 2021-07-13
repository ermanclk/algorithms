package javatrainers.labs;

public class Lab5Soru6 {

	public static void main(String[] args) {

		
//		(2 pts) Write a Java method that accepts two strings as parameters and returns a string that contains all
//		unique two-character strings whose first character comes from the first string and second character comes 
//		from the second string. All two-character strings in your returned string should be separated by a space. 
//		Use ordinary string concatenation in your solution. Look at the examples below for a hint on how to 
//		proceed and look at the String API for methods you can use to simplify your solution.
//		Examples:
//
//		First string   Second string   Returned string
//		ABCD           EFGH            AE AF AG AH BE BF BG BH CE CF CG CH DE DF DG DH
//		ACDC           ABBA            AA AB CA CB DA DB
	
		String firstString = "ACDC";
		String secondString = "ABBA";
		
		String[] strList = new String[firstString.length() * secondString.length()];
		int listCounter = 0;
		
		for (int i = 0; i < firstString.length(); i++) {
			
			for (int j = 0; j < secondString.length(); j++) {
				
				String newStr = firstString.substring(i,i+1) + secondString.substring(j, j+1);
				
				boolean listContainsStr = false;
				for (int k = 0; k < listCounter; k++) {
					if(strList[k].equals(newStr)) {
						listContainsStr = true;
						break;
					}
					
					
				}

				if (!listContainsStr) {
					strList[listCounter] = newStr;
					listCounter++;
				}
				
				
				
			}
			

			
		}

		for (int j = 0; j < listCounter; j++) {
			System.out.print(strList[j] + " ");
			
		}		
	}

}
