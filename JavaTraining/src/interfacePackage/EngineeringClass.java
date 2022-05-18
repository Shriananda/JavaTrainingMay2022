package interfacePackage;

public class EngineeringClass implements Student,ParentStudent1 {

	
	public void displayName() {
		System.out.println("We are from EngineeringClass");		
	}

	
	public void getStudentNumber() {
		System.out.println("We are 120 students");
	}

	
	public void getStandard() {
		System.out.println("We are from Computer Science");
	}

	public void getUniversity() {
		System.out.println("University name is: "+Student.university);
		System.out.println("University1 name is: "+university1);
		Student.m();
	}
	
	public static void main(String args[]){
		EngineeringClass eclass = new EngineeringClass();
		MedicalClass mclass = new MedicalClass();
		
		eclass.displayName();
		eclass.getStandard();
		eclass.getStudentNumber();
		eclass.getUniversity();
		System.out.println("****************************************");
		mclass.displayName();
		mclass.getStandard();
		mclass.getStudentNumber();
		mclass.getUniversity();
		
		
	}


	@Override
	public void getInterfaceName() {
		System.out.println("getInterfaceName() EngineeringClass");
		
	}


	@Override
	public void m() {
		System.out.println("interface m method from eng class");
		
	}
}
