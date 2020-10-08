package t2.e7;
import java.util.Scanner;
public class Exercise_7 {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner (System.in);
		System.out.print("Введите число a: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int a = sc.nextInt();
		
		System.out.print("Введите число b: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int b = sc.nextInt();
		
		System.out.print("Введите число c: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int c = sc.nextInt();
		
		if (a < 0) {
			++i;
		}
		if (b < 0) {
			++i;
		}
		if (c < 0) {
			++i;
		}
		System.out.print("Отрицательных чисел: " + i);
	}

}
