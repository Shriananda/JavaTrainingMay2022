import java.util.Arrays;


public class Sorting {

	public static void main(String[] args) {

		int[] a = new int[]{8,2,9,7,33,3,87};
		System.out.println("Before Sorting: "+Arrays.toString(a));
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			temp = a[i];
			for(int j=1;j<=a.length;j++){
				if(a[j]>temp){
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Before Sorting: "+Arrays.toString(a));
		
	}

}
