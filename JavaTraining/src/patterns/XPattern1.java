package patterns;

public class XPattern1 {

	
		//Output
		/*	5   1
			 4 2
			  3
			 2 4
			1   5*/
			//num of Rows and columns is input value (n) (for loops i and j)
			//m is middle num -- m=n+1/2
			//first diagnol places (L to R) --> i and j are same
			//second diagnol places (R to L)--> i+j == n+1
			//other places -- space
			// first step.. create pattens with loop and if condition
			public static void main(String[] args) {
				
				/*Scanner s = new Scanner(System.in) ;
				int n = s.nextInt();*/
				int n = 7;
				int i,j,m;
				m=(n+1)/2;
				for(i=1;i<=n;i++){
					for(j=1;j<=n;j++){
						if(i==j){
							if(i<m)
							{ 		
								if(i>1){
									 System.out.print(" "+(n-i+1)+" ");
								}else{
									 System.out.print((n-i+1)+" ");
								}					  
							}else if(i==m&&j==m){
								System.out.print("  "+m+" ");
							}
							else {
								for (int k2 = i; k2 > m; k2--) {
									System.out.print(" ");
								}
								System.out.print(i+" ");					
							}
						}
						else if((i+j)==(n+1)){
							if(i<m)
							{
								System.out.print(i+" ");
							}else {
								System.out.print(j+" ");
							}
						}
					}
					System.out.println();
				}

			}

	}


