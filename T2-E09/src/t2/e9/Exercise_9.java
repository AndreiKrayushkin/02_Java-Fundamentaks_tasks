package t2.e9;
import java.util.Scanner;
public class Exercise_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Введите значение х: ");
		while (!sc.hasNextInt()) {
			sc.next();
		}
		int x = sc.nextInt();
		
		if (x <= 3) {
			int func = (int)Math.pow(x, 2) - (3 * x) + 9;
			System.out.print(func);
		} else {
			double func2 = 1 / (Math.pow(x, 3) + 6);
			System.out.print(func2);
		}
		
		
	}

}
