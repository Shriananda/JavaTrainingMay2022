package arrayConcept;

public class TestArrayCopyDemo {
	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',
				't', 'e', 'd' };
		// declaring a destination array
		char[] copyTo = new char[7];
		// copying array using System.arraycopy() method
		// Object src, int srcPos,Object dest, int destPos, int length
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);

		// printing the destination array
		System.out.println(String.valueOf(copyTo));
		System.out.println(copyTo);

		// Object src, int srcPos,Object dest, int destPos, int length
		System.arraycopy(copyFrom, 0, copyTo, 0, 7);
		System.out.println(copyTo);

		System.out.println("Are both equal?");
		System.out.println(copyFrom == copyTo);

		// declaring a source array
		char[] copyFrom1 = { 'd'};
		// declaring a destination array
		char[] copyTo1 = new char[2];
		System.arraycopy(copyFrom1, 0, copyTo1, 0, 1);
		System.out.println(copyTo1);
		
		System.out.println("Are both equal?");
		System.out.println(copyFrom1 == copyTo1);
	}
}
