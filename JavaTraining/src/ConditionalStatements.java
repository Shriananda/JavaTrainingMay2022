
public class ConditionalStatements {

	public static void main(String[] args) {
		
		String str1 = "Hello" ;
		String str2 = "Team" ;
		int a =500;
		int b = 200;
		
		System.out.println(str1+" "+str2);
		System.out.println(a+b);
		System.out.println(a+b+str1+str2);
		System.out.println(str1+str2+a+b);
		
		/*if(a>1000){
			System.out.println("a is greater than 1000");
		}else{
			System.out.println("a is lesser than 1000");
		}*/
		
		if(a==100){
			System.out.println("a is 100");
		}else if(a==200){
			System.out.println("a is 200");
		}else if(a==300){
			System.out.println("a is 300");
		}else{
			System.out.println("Value does not present");
		}
		
		System.out.println("*************Switch statement*************");
		switch (a) {
		case 100:
			System.out.println("a is 100");
			break;
		case 300:
			System.out.println("a is 300");
			break;
		case 200:
			System.out.println("a is 200");
			break;
		default:
			System.out.println("Value does not present");
		}
		
	}

}
