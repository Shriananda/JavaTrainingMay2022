package encapsualation;

public class BankLoan {
	
	private String name;
	private int age;
	private int amount;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {		
		return age;
	}
	public void setAge(int age) {
		if(age>=18&&age<=50)
			this.age = age;
		else
			System.out.println("Please enter a correct age");
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		if(amount>=1000&&amount<=10000000)
			this.amount = amount;
		else
			System.out.println("Please enter correct amount");
	}
	
	
	
	
}
