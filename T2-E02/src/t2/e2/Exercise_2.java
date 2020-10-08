package t2.e2;
import java.util.Scanner;
public class Exercise_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//ввод числа a
		System.out.print("Введите a: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int a = sc.nextInt();
		//ввод числа b
		System.out.print("Введите b: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int b = sc.nextInt();
		
		//Ввод числа c
		int c = 0;
		while (c == 0) {
			System.out.print("Введите c: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			c = sc.nextInt();
		}
		
		//ввод числа d
		int d = 0;
		while (d == 0) {
			System.out.print("Введите d: ");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			d = sc.nextInt();
		}
		
		double y1 = (double)(a*b-c)/(c*d);
		double resultat = (double)((a/c) * (b/d) - y1);
		System.out.print(resultat);
	}

}
