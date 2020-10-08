package t2.e11;
import java.util.Scanner;
public class Exercise_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите первое число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		double a = sc.nextDouble();
		
		System.out.print("Введите второе число: ");
		while (!sc.hasNextDouble()) {
			sc.next();
		}
		double b = sc.nextDouble();
		
		double h = -1;
		while (h < 0) {
			System.out.print("Введите шаг: ");
			while (!sc.hasNextDouble()) {
				sc.next();
			}
			h = sc.nextDouble();
		}
		double y = 0;
		if (a < b) {
			for (double x = a; x <= b; x = x+h) {
				if (x > 2) {
					y = x;
				}else {
					y = -x;
				}
				System.out.println("x =" + x + " y= " + y);
			}
		}
	}
}
