package t2.e15;
import java.util.Scanner;
public class Exercise_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = -1;
		while (a <= 0) {
			System.out.print("Введите первое число: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			a = sc.nextInt();
		}
		
		int b = -1;
		while (b <= 0) {
			System.out.print("Введите второе число: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			b = sc.nextInt();
		}
				
		while (a != 0 && b !=0) {
			if (a > b) {
				a = a % b;
				System.out.println(a);
			} else {
				b = b % a;
				System.out.println(b);
			}
		}
		System.out.print(a + b);
	}

}
