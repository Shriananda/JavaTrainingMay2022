package arrayConcept;

public class TestArray {

	public static void main(String[] args) {
		int arrayOne[] = new int[10];
		int arrayTwo[] = {1,2,3,4,5};
		
		arrayOne[0]=1;
		arrayOne[1]=2;
		arrayOne[2]=21;
		arrayOne[3]=11;
		System.out.println("arrayOne");
		for (int i = 0; i < arrayOne.length-1; i++) {
			System.out.println(arrayOne[i]);
		}
		System.out.println("arrayTwo");
		for (int i = 0; i < arrayTwo.length-1; i++) {
			System.out.println(arrayOne[i]);
		}
	}

}
