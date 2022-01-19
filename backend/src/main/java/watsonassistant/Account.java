package watsonassistant;

import org.springframework.stereotype.Component;
import java.lang.String;

@Component
public class Account {
	private String cusname;
	private int cusid;
	private double accnum;
	private String acctype;
	private double balance;
public Account() {
	// TODO Auto-generated constructor stub
}
public Account(String cusname, int cusid, double accnum, String acctype, double balance) {
	super();
	this.cusname = cusname;
	this.cusid = cusid;
	this.accnum = accnum;
	this.acctype = acctype;
	this.balance = balance;
}
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
public int getCusid() {
	return cusid;
}
public void setCusid(int cusnnum) {
	this.cusid = cusid;
}
public double getAccnum() {
	return accnum;
}
public void setAccnum(double accnum) {
	this.accnum = accnum;
}
public String getAcctype() {
	return acctype;
}
public void setAcctype(String acctype) {
	this.acctype = acctype;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
 

	
		}
	
		


