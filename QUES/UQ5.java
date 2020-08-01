import java.util.Scanner;

class Account{
	String name,address,type;
	long accNum,initialAmount,currentBalance=0;
	Account(String name,long accNum,long initialAmount){
		this.name=name;
		this.accNum=accNum;
		this.initialAmount=initialAmount;
		this.currentBalance=initialAmount;
	}
	Account(String name,long accNum , String address ,String type , long currentBalance ){
		this.name=name;
		this.accNum=accNum;
		this.address=address;
		this.type=type;
		this.currentBalance=currentBalance;
	}
	void Deposit() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter amount to deposit : ");
		long amount = s.nextLong();
		if(currentBalance!=0) {
			currentBalance = currentBalance + amount;
		}
		else
		{
			currentBalance = initialAmount+amount;
		}
		System.out.println("Successfully deposited .");
		System.out.println("Current Balance : "+currentBalance);
	}
	void WithDraw() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter amount to withdraw : ");
		long amount = s.nextLong();
		if(currentBalance<amount)
			System.out.println("Withdraw Failed (Insufficient Balance)");
		else
		{
			currentBalance = currentBalance - amount;
			System.out.println("Withdraw Successful");
			System.out.println("Current Balance : "+currentBalance);
		}
	}
	long GetBalance() {
		return currentBalance;
	}
}
public class UQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = s.nextLine();
		System.out.print("Enter Account Number : ");
		long accnum = s.nextLong();
		System.out.print("Enter Initial Amount you want to add to your Account : ");
		long initial = s.nextLong();
		Account o = new Account(name,accnum,initial);
		int ch=0;
		while(ch!=4) {
			System.out.println("1. Deposit money to the Account");
			System.out.println("2. Get Balance of the Account");
			System.out.println("3. Withdraw money from the Account");
			System.out.println("4. EXIT");
			System.out.print("Choice-->");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				o.Deposit();
				break;
			case 2:
				System.out.println("Balance in Account "+o.accNum+" is "+o.GetBalance());
				break;
			case 3:
				o.WithDraw();
				break;
			default:
				System.out.println("Enter something valid you asshole");
				break;
			}
		}
	}

}