package javatrainers.labs;

public class Lab3Soru9 {

	public static void main(String[] args) {
		
		
		String[] stringArray = new String[40];
		
		String[] duplicateStringsArray = new String[stringArray.length / 2];
		int duplicateCounter = 0;
		

		for (int i = 0; i < stringArray.length; i++) {
			Integer tmpInt = (int) (Math.random()*100);
			String tmpStr = tmpInt.toString();
			stringArray[i] = tmpStr;
		}

		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]+ ", ");
		}	
		
		for (int i = 0; i < stringArray.length; i++) {
			
			String karsilastirilacakDeger = stringArray[i];
			boolean arananSayiBulundu = false;
			for(int k=0 ; k < duplicateCounter ; k++) {
				if (karsilastirilacakDeger.equals(duplicateStringsArray[k])) {
					arananSayiBulundu = true;
					break;
				}
			}
			if (!arananSayiBulundu) {
				for (int j = i + 1; j < stringArray.length; j++) {
					String digerDeger = stringArray[j];
					if (karsilastirilacakDeger.equals(digerDeger)) {
						duplicateStringsArray[duplicateCounter] = karsilastirilacakDeger;
						duplicateCounter++;
						break;
					}
					
				}
			}
			
		}
		System.out.println("");
		System.out.println("Mükerrer sayýlar");
		for (int i = 0; i < duplicateCounter; i++) {
			System.out.print(duplicateStringsArray[i]+ ", ");
		}			
		
				
				
	}

}
