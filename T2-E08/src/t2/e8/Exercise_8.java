package t2.e8;
import java.util.Scanner;
public class Exercise_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = -1;
		while (a <= 0) {
			System.out.print("Введите ширину отверстия: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			a = sc.nextInt();
		}
		
		int b = -1;
		while (b <= 0) {
			System.out.print("Введите высоту отверстия: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			b = sc.nextInt();
		}
		
		int x = -1;
		while (x <= 0) {
			System.out.print("Введите ширину кирпича: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			x = sc.nextInt();
		}
		
		int y = -1;
		while (y <= 0) {
			System.out.print("Введите высоту кирпича: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			y = sc.nextInt();
		}
		
		int z = -1;
		while (z <= 0) {
			System.out.print("Введите длину кирпича: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			z = sc.nextInt();
		}
		
		if (x <= a && y <= b || y <= a && x <= b ||
			x <= a && z <= b || z <= a && x <= b ||
			z <= a && y <= b || y <= a && z <= b) {
			System.out.print("Кирпич пролезет в отверстие.");
		} else {
			System.out.print("Кирпич не пролезет в отверстие.");
		}
		
	}

}
