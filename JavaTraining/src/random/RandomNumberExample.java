package random;

public class RandomNumberExample {
	public static void main(String args[]) {
		int min = 200;
		int max = 400;
		// Generate random double value from 200 to 400
		System.out.println("Random value of type double between " + min
				+ " to " + max + ":");
		double a = Math.random() * (max - min + 1) + min;
		System.out.println(a);
		// Generate random int value from 200 to 400
		System.out.println("Random value of type int between " + min + " to "
				+ max + ":");
		int b = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(b);
		System.out.println("calc: "+(max - min + 1) + min);
		double a1 = Math.random();
		System.out.println(a1);
		System.out.println((a1 * (max - min + 1) + min));
	}
}
