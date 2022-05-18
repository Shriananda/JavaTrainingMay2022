package arrayConcept;

public class PassArray2Method {

	 PassArray2Method p = new PassArray2Method();
	 
	public static void minElement(int a[]){
		
		int min = a[0];
		
		for(int i=1;i<a.length;i++){
			if(min>a[i]){
				System.out.println(a[i]);
				min = a[i];
			}
		}
		
		System.out.println("Minumum is "+min);
	}
	
	public static int[] returnArray(){
		return new int[]{1,2,3,4,5};
		
	}
	
	public static int[] returnArray1(){
		return new int[10];
		
	}
	
	public static PassArray2Method returnObj(){
		return new PassArray2Method();
		
	}
	
	public  PassArray2Method returnObj1(){
		return p;
		
	}
	
	public static void main(String[] args) {
		int a[] = {5,2,3,4,5};
		minElement(a);
		int a1[] = new int[]{5,2,3,4,5};
		
		PassArray2Method p= returnObj();

	}

}
