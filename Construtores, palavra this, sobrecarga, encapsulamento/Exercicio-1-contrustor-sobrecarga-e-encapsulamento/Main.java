package entities;

public class Account {

	private final int number;
	private String holder;
	private double balance;

	public Account(int number, String holder, double inicialDeposite) {
		this.number = number;
		this.holder = holder;
		deposite(inicialDeposite);
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;

	}
	
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		this.balance += amount;

	}

	public void withdraw(double amount) {
		this.balance -= amount + 5 ;

	}

	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);

	}
}

/*
 
 import entities.Account;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Account user;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)?");
		char inicial = sc.next().charAt(0);

		if (inicial == 'y') {
			System.out.println("Enter initial deposit value: ");
			double value = sc.nextDouble();

			user = new Account(number, holder, value);

		} else {
			user = new Account(number, holder);

		}

		System.out.println("Account data: ");
		System.out.println(user);

		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		user.deposite(amount);
		System.out.println("Updated account data: ");
		System.out.println(user);

		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		user.withdraw(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(user);

		sc.close();

	}
}

*/