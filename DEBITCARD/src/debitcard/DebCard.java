/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package debitcard;
import java.io.Serializable;
/**
 *
 * @author HJD
 */
public class DebCard implements Serializable{
    private Name name;
	private float balance;
	private String accountNumber;
	

	public DebCard() {}

	public DebCard(Name name, float balance, String accountNumber) {
		this.name = name;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getaccountNumber() {
		return accountNumber;
	}

	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public float inquireBalance() {
		return this.balance;
	}

	public float depositCash(float amount) {
		return this.balance+= amount;
	}

	public boolean withdrawCash(float amount) {		
		boolean returnCode = false;
		
		if(this.balance>=amount) {
			this.balance -= amount;
			returnCode = true;
		}
		
		return returnCode;	
	}

	public float interest(float rate) {
		float retValue = (this.balance * (rate/100))/12;
		balance += retValue;
		return retValue;
	}

	@Override
	public String toString() {
		return "Name :  " + this.name + " \n" 
	         + "Account Number: " + this.accountNumber + " \n"
			 + "Balance : " + String.format("%.2f", this.balance);
	}

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setaccountNUmber(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
