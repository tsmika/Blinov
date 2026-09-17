package chapter5.chapter5A3;

/*
Создать класс Account с внутренним классом, с помощью объектов которого можно хранить
информацию обо всех операциях со счетом (снятие, платежи, поступления).
 */
public class Chapter5A3 {

	public static void main(String[] args) {
		Account account = new Account("1");
		account.credit(1000); // баланс: 1000
		account.withdraw(200); // баланс: 800
		account.payment(150); // баланс: 650
		account.credit(500); // баланс: 1150
		account.withdraw(50); // баланс: 1100
		account.payment(300); // баланс: 800
		account.credit(2000); // баланс: 2800
		account.withdraw(400); // баланс: 2400
		account.payment(100); // баланс: 2300
		account.credit(700); // баланс: 3000

		account.printTransactions();
	}
}
