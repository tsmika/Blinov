package chapter3.chapter3A2;

import java.util.Arrays;

/* 
  Создать массив объектов. Вывести:
	a) список покупателей в алфавитном порядке;
	b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import chapter3.Customer;
import chapter3.TestDataCreator;

public class chapter3A2 {

	public static void main(String[] args) {
		Customer[] customers = TestDataCreator.createCustomerArray();
		print(customers);
		System.out.println();

//		список покупателей в алфавитном порядке;
		Arrays.sort(customers);
		print(customers);

//		список покупателей, у которых номер кредитной карточки находится в заданном интервале
		System.out.println();
		getByCardNumInterval(customers, 4000000000000000L, 5000000000000000L);

	}

	private static void print(Customer[] customers) {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	private static void getByCardNumInterval(Customer[] customers, long start, long end) {
		for (Customer customer : customers) {
			long cardNum = Long.parseLong(customer.getCardNum().replaceAll(" ", ""));
			if (cardNum >= start && cardNum <= end)
				System.out.println(customer);
		}

	}

}
