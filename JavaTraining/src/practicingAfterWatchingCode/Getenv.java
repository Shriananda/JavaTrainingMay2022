package practicingAfterWatchingCode;

public class Getenv {

	public static void main(String[] args) {

		String java_home = System.getenv("JAVA_HOME");

        System.out.println(java_home);
        
        System.out.println(System.getenv("USERNAME"));
        //System.out.println(System.getenv("HOME"));

	}

}
