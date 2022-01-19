package watsonassistant;

import org.springframework.beans.factory.annotation.Autowired;

public class Transaction {
	
	private double deposit;
	private double withdraw;
	private double date_time; 
	@Autowired
	private Account account;
	
	
public Transaction(double deposit, double withdraw, double date_time, Account account) {
		super();
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.date_time = date_time;
		this.account = account;
	}

public double getDeposit() {
	return deposit;
}

public void setDeposit(double deposit) {
	this.deposit = deposit;
}

public double getWithdraw() {
	return withdraw;
}

public void setWithdraw(double withdraw) {
	this.withdraw = withdraw;
}

public double getDate_time() {
	return date_time;
}

public void setDate_time(double date_time) {
	this.date_time = date_time;
}

public Account getAccount() {
	return account;
}

public void setAccount(Account account) {
	this.account = account;
}

public Transaction() {
	// TODO Auto-generated constructor stub
}


public void deposit(double amount)	// note "mutator" method
{
    double newBalance = account.getBalance() + amount;
    account.setBalance(newBalance);				// modifies instance var			
}


public void withdraw(double amount)	// note "mutator" method
{
    double newBalance = account.getBalance() - amount;
    account.setBalance(newBalance);			// modifies instance var
}

public void transferFundsA(Account destination, double amount)
{
    destination.setBalance(destination.getBalance() + amount);
   
   account.setBalance(account.getBalance() - amount);
}


public void transferFundsB(Transaction destination, double amount)
{
    destination.deposit(amount);	
    this.withdraw(amount);          
}

}
