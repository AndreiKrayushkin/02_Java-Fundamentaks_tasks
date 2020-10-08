package t2.e14;
import java.util.Scanner;
public class Exercise_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = -1;
		while (a < 0) {
			System.out.print("Введите число а: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			a = sc.nextInt();
		}

		boolean flag = false;
		int result = 1;
		for (int x = 2; x <= a; x++) {
			int fact = result * x;
			if (fact > result) {
				result = fact;
			} else {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.print("Факториал для числа " + a + " равен: " +result);
		} else {
			System.out.print("Превышен допустимый размер для переменной int");
		}
	}

}
