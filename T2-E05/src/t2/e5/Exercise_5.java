package t2.e5;
import java.util.Scanner;
public class Exercise_5 {

	public static void main(String[] args) {
		
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
		
		if (a < b) {
			System.out.print("Число a меньше числа b.");
		} else {
			System.out.print("Число b меньше числа a.");
		}
		
	}

}
