package bankdb;

import java.util.Map;

public class BankApp {
	static class BankDatabase {

		/*
		 * Hello, there is an assignment I'm struggling with which deals with the
		 * concepts of inheritance, polymorphism and interface.
		 * 
		 * here is the assignment:
		 * 
		 * For this project, you shall define a new class BankDatabase. The BankDatabase
		 * contains the bank account information for all accounts including saving
		 * accounts and checking accounts. The customer names are passed as “firstname
		 * lastname”. Your application must split the string into two separate strings
		 * for first name and last name (Hint: use the split() method). If you decide to
		 * use an array to store the bank accounts, you can assume there will be maximum
		 * of 100 bank accounts in the Bank Database. Alternatively, you can consider
		 * using an ArrayList in which case its size can grow automatically as new bank
		 * accounts are added. BankDatabase class implements the following methods:
		 */
		public BankDatabase() {
			super();
			// TODO Auto-generated constructor stub
		}

		void createCheckingAccount(String customerName, String ssn, float deposit) {
//  This method creates a checking account
		}

		void createSavingAccount(String customerName, String ssn, float deposit) {
//  This method creates a saving account
		}

		void print() {
//	  This method prints the bank account information in the
		}

		private int database; // in ascending order of the account balances.

		void applyInterest() {
//	  This methods applies interest to all bank accounts. The
		}
	}

//  interest for each type of account is the same as project 5.
	private static final double CHECKING_ACCOUNT_INTEREST_RATE = .001;
	private static final double SAVINGS_ACCOUNT_INTEREST_RATE = .01;

	private Map<String, BankAccount> accounts;

	/*
	 * 
	 * 
	 * Make the following updates to the BankAccount super class:
	 * 
	 * 1) Make the BankAccount super class an abstract class and make applyInterest
	 * an abstract method.
	 */
	static abstract class BankAccount implements Comparable<BankAccount> {
		private String firstName;
		private String lastName;

		/*
		 * 2) The BankAccount super class shall implement the Comparable Interface. You
		 * shall implement the compareTo method to provide the means to sort the bank
		 * accounts in the ascending order of the account balance.
		 */

		private double balance;

		@Override
		public int compareTo(BankAccount o) {

			return Double.compare(this.balance, o.balance);
		}

		/*
		 * Identify the objects for this application and define each class attribute
		 * with proper access qualifier. You can use the “main” method shown below to
		 * test your application. The expected output is also provided.
		 */
	}

	/*
	 * 
	 * 
	 * 
	 * public class BankApp {
	 */
	public static void main(String[] args) {
		BankDatabase acctDatabase = new BankDatabase();

		acctDatabase.createCheckingAccount("Alin Parker", "123-45-6789", 20000.0f);

		acctDatabase.createSavingAccount("Mary Jones", "987-65-4321", 15000.0f);

		acctDatabase.createSavingAccount("John Smith", "123-45-6789", 12000.0f);

		acctDatabase.print();

		acctDatabase.applyInterest();

		acctDatabase.print();

	}
	/*
	 * 
	 * 
	 * ======= expected output =============
	 * 
	 * Succesfully created account for Alin Parker Account Number 5435736518
	 * 
	 * Succesfully created account for Mary Jones Account Number 3612979581
	 * 
	 * Succesfully created account for John Smith Account Number 6998050883
	 * 
	 * John Smith, accn #: 6998050883, Balance $12000.0
	 * 
	 * Mary Jones, accn #: 3612979581, Balance $15000.0
	 * 
	 * Alin Parker, accn #: 5435736518, Balance $20000.0
	 * 
	 * John Smith, accn #: 6998050883, Balance $12600.0
	 * 
	 * Mary Jones, accn #: 3612979581, Balance $15750.0
	 * 
	 * Alin Parker, accn #: 5435736518, Balance $20200.0
	 * 
	 * 
	 */

}
