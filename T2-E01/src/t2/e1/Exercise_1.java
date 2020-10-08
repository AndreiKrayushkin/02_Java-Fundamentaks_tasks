package t2.e1;
import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = 0;
		while (a == 0) {
			System.out.print("введите a: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			a = sc.nextInt();
		}

		System.out.print("введите b: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int b = sc.nextInt();
		
		System.out.print("введите c: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int c = sc.nextInt();
		
		double y = (b + (Math.sqrt(Math.pow(b, 2) + 4 * a * c))) / (2 * a) - (Math.pow(a, 3) * c) + Math.pow(b, -2);
		System.out.println("Результат вычисления: " + y);	
	}

}
