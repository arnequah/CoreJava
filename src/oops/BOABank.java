package oops;

public class BOABank extends Bank{
	
	public int CreditCardNum;
	
	public void CCBalance() {
		
		System.out.println("Inside CC Balance");
		
		this.CreditCardNum = 1000;
		super.AccountNum = 123456;
		this.AccountNum = 7890;
	}
	
	public void CloseAccount(int CCNumber) {
		
			System.out.println("Inside BOA CloseAccount");
	}

}
