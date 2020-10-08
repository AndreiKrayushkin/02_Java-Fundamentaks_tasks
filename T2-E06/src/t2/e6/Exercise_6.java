package t2.e6;
import java.util.Scanner;
public class Exercise_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Ввод первого угла
		int x1 = -1;
		while (x1 <= 0) {
			System.out.print("Введите первый угол");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			x1 = sc.nextInt();
		}
				
		//Ввод второго угла
		int x2 = -1;
		while (x2 <= 0) {
			System.out.print("Введите второй угол");
			while (!sc.hasNextInt()) {
				sc.next();
			}
			x2 = sc.nextInt();
		}
		
		if (x1 + x2 < 180) {
			if (x1 + x2 + 90 == 180) {
				System.out.print("Треугольник существует и он прямоугольный!");				
			} else {
				System.out.print("Треугольник существует, но он не прямоугольный!");
			}
		} else {
			System.out.print("Треугольник не существует!");
		}
		
	}

}
