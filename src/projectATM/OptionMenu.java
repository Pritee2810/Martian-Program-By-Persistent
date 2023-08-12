package projectATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(734820, 729402);
				data.put(876544, 235435);
				
				System.out.println("Welcome to ATM Project");
				System.out.println("Enter your customer number");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter PIN number");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e){
				System.out.println("\n" + "Invalid Character(s). Only numbers." + "\n");
				x=2;
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(data.containsKey(cn) && data.get(cn)==pn) {
				getAccountType();
			}else
				System.out.println("\n" + "Wrong Customer number or PIN number" + "\n");
		}while(x==1);
	}
	
	public void getAccountType() {
		System.out.println("Select Account you want to access");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		
		int selection = menuInput.nextInt();
		
		switch (selection) {
		case 1: 
			getChecking();
			break;
			
		case 2: 
			getSaving();
			break;
			
		case 3: 
			System.out.println("Thank you for using this paytm, Bye \n");
			break;
			
		default:
			System.out.println("\n Invalid choice \n");
			break;
		}
	}
	
	public void getChecking() {
		System.out.println("Checking Account : ");
		System.out.println("Type 1 - View Balance ");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this paytm, Bye \n");
			getAccountType();
			break;
			
		default:
			System.out.println("\n Invalid choice \n");
			break;
		}
	}

	public void getSaving() {
		System.out.println("Saving Account : ");
		System.out.println("Type 1 - View Balance ");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposite Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice: ");
		
		int selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: "+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for using this paytm, Bye \n");
			getAccountType();
			break;
			
		default:
			System.out.println("\n Invalid choice \n");
			break;
	}


	}
}
