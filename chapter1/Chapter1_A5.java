package chapter1;

// 5. Ввести целые числа как аргументы командной строки, подсчитать их суммы и произведения. Вывести результат на консоль.

public class Chapter1_A5 {

	public static void main(String[] args) {
		int sum = 0;
		int product = 1;
		
		for(String item : args) {
			int i = Integer.parseInt(item);
			sum += i;
			product *= i;
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
	}

}
 /*
D:\Soft\IDE Eclipse\Workspace\Blinov\src>java chapter1.Chapter1_A5 1 2 3 6
Sum = 12
Product = 36
  */
