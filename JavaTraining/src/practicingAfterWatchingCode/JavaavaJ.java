package practicingAfterWatchingCode;

public class JavaavaJ {

	public static void main(String[] args) {
		String str = "Java" ;
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb1 = sb.reverse();
		System.out.println(sb1);
		String str1 =  sb1.toString();
		System.out.println(str+str1);
	}

}
