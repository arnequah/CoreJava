package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee();
		
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display();
		
		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.Display();
		
		Bank B = new Bank();
		
		B.DisplayBalance();
		int Bal = B.GetBalance();
		B.AccountNum = 500;
		
		System.out.println("The Balance is " + B.GetBalance());
		System.out.println("The Balance is " + Bal);
		
		BOABank B1 = new BOABank();
		
		B1.CCBalance();
		B1.DisplayBalance();
		
		B1.AccountNum = 100;
		
		// Overloading Example
		
		OverLoadingExample obj = new OverLoadingExample();
		
		int RecArea = obj.GetArea(3, 4);
		int SqArea = obj.GetArea(4);
		
		System.out.println("The rectangle area is " + RecArea);
		System.out.println("The square area is " + SqArea);

		// Overriding Example
		
		B1.CloseAccount(12345);
		B.CloseAccount();
		
		Chrome Ch = new Chrome();
		Ch.OpenBrowser();
		Ch.Show();
		
		Browser Br = new Chrome();
		
		Br.OpenBrowser();
		Br.CloseBrowser();
		Br.DisplayName();
		
		HondaCar car1 = new HondaCar();
		CarInterface car2 = new HondaCar();
		
		EncapsulationEx En = new EncapsulationEx();
		
		En.setBalance(3000);
		
		System.out.println(En.getBalance());
		
	}

}

