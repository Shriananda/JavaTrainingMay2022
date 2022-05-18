package practicingAfterWatchingCode;

public class TizzPizz {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			if(i%3==0&&i%5!=0){
				System.out.println("Tizz");
			}else if(i%5==0&&i%3!=0){
				System.out.println("Pizz");
			}else if((i%3==0)&&(i%5==0)){
				System.out.println("TizzPizz");
			}else{
				System.out.println(i);
			}
			
		}

	}

}
