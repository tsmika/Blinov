package chapter5.chapter5A3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Account {
	private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
	private final String id;
	private double balance;
	private final TransactionList transactionList = new TransactionList();

	public Account(String id) {
		this.id = Objects.requireNonNull(id);
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			transactionList.addTransaction("WITHDRAW", amount);
		} else {
			System.out.println("Cannot withdraw " + amount + ", your balance: " + balance);
		}
	}

	public void payment(double amount) {
		if (amount <= balance) {
			balance -= amount;
			transactionList.addTransaction("PAYMENT", amount);
		} else {
			System.out.println("Cannot pay " + amount + ", your balance: " + balance);
		}
	}

	public void credit(double amount) {
		balance += amount;
		transactionList.addTransaction("CREDIT", amount);
	}

	public void printTransactions() {
		transactionList.printTransactions();
	}

	public String getId() {
		return id;
	}

	public class TransactionList {
		private final List<String> transactions = new ArrayList<>();

		public void addTransaction(String type, double amount) {
			ZonedDateTime now = ZonedDateTime.now();
			transactions.add(now.format(FMT) + ", " + type + ": " + amount);
		}

		public void printTransactions() {
			for (String transaction : transactions) {
				System.out.println(transaction);
			}
		}
	}

}
