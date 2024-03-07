package NewClassesandObject;
abstract class Account{
	long accountNumber;
	double balance;
	Account(long accountNumber,double balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	abstract void Deposit(double a);
	abstract void WithDraw(double a1);
}
class SavingAccount extends Account{
	double interest;
SavingAccount(long accountNumber, double balance,double interest) {
		super(accountNumber, balance);
		this.interest=interest;
	}
	@Override
	void Deposit(double d) {
		if(d>0) {
			double p=this.balance+d;
			System.out.println("Account number is:"+this.accountNumber);
			System.out.println("After deposit the balance is:"+p);
			System.out.println("Interest rate is:"+((p*this.interest)/100));
		}
		else {
			System.out.println("Please enter valid amount!!");
		}
	}

	@Override
	void WithDraw(double d1) {
		if(d1<=this.balance&&d1>0) {
			double p1=(this.balance-d1);
			System.out.println("Account number is:"+this.accountNumber);
			System.out.println("After withdraw the balance is:"+p1);
			System.out.println("Interest rate is:"+((p1*this.interest)/100));
		}
		else {
			System.out.println("Please enter valid amount!!");
		}
	}
	
}
class CurrentAccount extends Account{
double overdraft;
	CurrentAccount(long accountNumber, double balance,double overdraft) {
		super(accountNumber, balance);
		this.overdraft=overdraft;
	}

	@Override
	void Deposit(double d) {
		if(d<=this.overdraft&&d>0) {
			System.out.println("Account number is:"+this.accountNumber);
			System.out.println("After deposit the balance is:"+(this.balance+d));
		}
		else {
			System.out.println("Please enter valid amount!!");
		}
		
	}

	@Override
	void WithDraw(double d1) {
		if(d1<=this.overdraft&&d1>0&&d1<=balance) {
			System.out.println("Account number is:"+this.accountNumber);
			System.out.println("After withdraw the balance is:"+(this.balance-d1));
		}
		else {
			System.out.println("Please enter valid amount!!");
		}
		
	}
	
}
public class Display6 {

	public static void main(String[] args) {
		SavingAccount ob1=new SavingAccount(925783062,12500.50,5);
		ob1.Deposit(1200);
		ob1.WithDraw(2000);
		System.out.println("-------------------------------------");
		CurrentAccount ob2=new CurrentAccount(925783062,12500.50,50000);
		ob2.Deposit(1200);
		ob2.WithDraw(2000);

	}

}
