package arrayConcept;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class AddMultiDimArray {

	int a[][]={
			{1,2,3},
			{2,4,5},
			{4,4,5}
			};
	
	int b[][]={
			{1,2,3},
			{2,4,5},
			{4,4,5}
			};
	int add[][]=new int[3][3];
	
	void add(){		
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				add[i][j]=a[i][j]+b[i][j];
				System.out.print(add[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("********************");
		for(int i=0; i<3;i++){
			for(int j=0; j<3;j++){
				System.out.print(add[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		new AddMultiDimArray().add();
	}

}
