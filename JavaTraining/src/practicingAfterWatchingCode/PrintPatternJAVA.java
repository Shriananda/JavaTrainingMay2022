package practicingAfterWatchingCode;

public class PrintPatternJAVA {

	public static void main(String[] args) {
		String str = "JAVA" ;
		int strLen = str.length();
		char[] chArr = str.toCharArray();
		
		for (int i = 0; i < strLen; i++) {
				for(int k=0;k<=i;k++){
					for(int j=0;j<=i;j++){			
						System.out.print(chArr[j]);
					}
				}			
			System.out.println();			
		}

	}

}
