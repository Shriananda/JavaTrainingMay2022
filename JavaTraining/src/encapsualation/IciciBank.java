package encapsualation;

public class IciciBank extends BankLoan {

	public static void main(String args[])
	{
		BankLoan bankLoan = new BankLoan();
		
		bankLoan.setAge(200);
		bankLoan.setAmount(100000);
		bankLoan.setName("Shriananda");
		
		System.out.println("Name: "+bankLoan.getName());
		System.out.println("Age: "+bankLoan.getAge());
		System.out.println("Amount: "+bankLoan.getAmount());
	}
}
