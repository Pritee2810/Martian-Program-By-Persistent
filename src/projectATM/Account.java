package projectATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}


	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking account balance "+ moneyFormat.format(getCheckingBalance()));
		System.out.println("Amount you want to withdraw from checking accout");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking account balance "+ moneyFormat.format(getCheckingBalance()));
		}else {
			System.out.println("Balance cannot be negative");
		}
	}

	public void getCheckingDepositInput() {
		System.out.println("Checking account balance "+ moneyFormat.format(getCheckingBalance()));
		System.out.println("Amount you want to Deposit from checking accout");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New checking account balance "+ moneyFormat.format(getCheckingBalance()));
		}else {
			System.out.println("Balance cannot be negative \n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving account balance "+ moneyFormat.format(getSavingBalance()));
		System.out.println("Amount you want to withdraw from Saving accout");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving account balance "+ moneyFormat.format(getSavingBalance()));
		}else {
			System.out.println("Balance cannot be negative");
		}
	}

	public void getSavingDepositInput() {
		System.out.println("Saving account balance "+ moneyFormat.format(getSavingBalance()));
		System.out.println("Amount you want to Deposit from Saving accout");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving account balance "+ moneyFormat.format(getSavingBalance()));
		}else {
			System.out.println("Balance cannot be negative \n");
		}
	}
}
