package interfacePackage;

public interface Student extends ParentStudent{

	public static final String university = "University of New York" ;
	
	String university1 = "University of New York" ;
	
	public void displayName();
	
	public void getStudentNumber();
	
	public void getStandard();
	
	static void m(){
		System.out.println("method defined in interface");
	}
	
}
