package banking;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.run();
	}
	public void run() {
		System.out.println("What is your name: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("Hello " + name+ "! We are creating checking and savings account for you");
		Customer customer = new Customer(name);
		System.out.println("What is your address?");
		String address = scanner.next();
		customer.setAddress(address);
		
		BankAccount checkingAccount = new BankAccount("checking", customer);
		BankAccount savingsAccount = new BankAccount("savings", customer);
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		System.out.println("Checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings account");
		System.out.println(savingsAccount.getAccountInfo());
		
		System.out.println();
		System.out.println("Amount to deposit in your checking account");
		double amount = scanner.nextDouble();
		checkingAccount.deposit(amount);
		
		System.out.println();
		System.out.println("Amount to deposit in your savings account");
		amount = scanner.nextDouble();
		savingsAccount.deposit(amount);
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		System.out.println();
		System.out.println("Amount to withdraw from your checking account");
		amount = scanner.nextDouble();
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println();
		System.out.println("Amount to withdraw from your savings account");
		amount = scanner.nextDouble();
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		scanner.close();
	}
}
