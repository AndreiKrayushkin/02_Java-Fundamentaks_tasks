package t2.e13;
import java.util.Scanner;
public class Exercise_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = -1;
		while (a <= 1) {
			System.out.print("Введите число а: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			a = sc.nextInt();
		}
		boolean flag = false;
		int resultat = 0;
		for (int x = 1; x <= a; x++) {
			int b = resultat + x;
			if (b > resultat) {
				resultat = b;
			} else {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.print("Сумма чисел от 1 до " + a + " включительно равна: " + resultat);
		} else {
			System.out.print("Превышен допустимый размер для переменной int.");
		}
	}
}
