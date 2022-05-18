package interfacePackage;

public class MedicalClass implements Student{

	
	public void displayName() {
		System.out.println("We are from Medical Dept");
	}

	
	public void getStudentNumber() {
		System.out.println("We are 140 students");
	}

	
	public void getStandard() {
		System.out.println("We are from MBBS");
	}
	
	public void getUniversity() {
		System.out.println("University name is: USA ");
		System.out.println("University1 name is: "+university1);
	}


	@Override
	public void getInterfaceName() {
		System.out.println("getInterfaceName() MedicalClass");
	}

}
