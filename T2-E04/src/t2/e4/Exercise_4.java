package t2.e4;
import java.util.Scanner;
public class Exercise_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print("Введите a: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int a = sc.nextInt();
		System.out.print("Введите b: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int b = sc.nextInt();
		
		if (a < b) {
			System.out.print(7);
		} else {
			System.out.print(8);
		}
		
	}

}
