package watsonassistant;
import java.util.*;
public class AccountService {
	private static Map<Long,Account> accounts = new HashMap<>();
	
	
	static {                           //name, customer id, a/c no, acc type, balance
		Account account1 = new Account( "dummy1", 101100, 1198678900, "savings", 80000);
		Account account2 = new Account( "dummy1", 101100, 1234567890, "savings", 50000);
		Account account3 = new Account( "dummy1", 101100, 1234664545, "current", 90000);
		
		Account account4 = new Account( "dummy2", 101101, 1176865787, "current", 100000);
		Account account5 = new Account( "dummy2", 101101, 1234845411, "savings", 190000);
		Account account6 = new Account( "dummy2", 101101, 1321664545, "current", 500000);
		
		
		
	}
	public static Account getAccountDetails(int cusid) {
		return accounts.get(cusid);
	}
	
}

