package stringPackage;

public class StringMethod {

	public static void main(String[] args) {
		String text = "Learning is the key";
		String text3 = "Learning is the key";
		String text4 =  "United States Of America" ;
		char ch = text.charAt(5) ;
		System.out.println(text.charAt(10));
		System.out.println(ch);
		
		String text2 = text.concat(" to success").concat(" and we are learning JAVA");
		System.out.println(text2);
		
		System.out.println(text.contains("is the"));
		
		System.out.println(text.endsWith("is the"));
		
		System.out.println(text.equals(text3));
		
		System.out.println(text.indexOf("is"));
		System.out.println(text.indexOf("IS")); //returns -1 as not found
		
		System.out.println(text.lastIndexOf("is"));
		System.out.println(text.lastIndexOf("IS")); //returns -1 as not found
		
		System.out.println(text.length());
		
		text3 = text3.replace("key", "essential");
		System.out.println(text3);
		
		String[] str=text3.split("the");
		System.out.println(str[0]+str[1]);
		
		System.out.println(text3.startsWith("Learning"));
		
		System.out.println(text4.substring(0, 13));
		
		char[] charArray = text4.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		System.out.println(text4.toUpperCase());
		System.out.println(text4.toLowerCase());
		
		System.out.println(text4.trim());
		
		
		System.out.println(text.charAt(50));
		System.out.println(text.equals(text3));
		
		
	}

}
