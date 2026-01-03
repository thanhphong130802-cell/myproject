package Test;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a =, ");
		double a = scanner.nextInt();
		System.out.println("b = ,");
		double b = scanner.nextInt();
		System.out.println("c = ,");
		double c = scanner.nextInt();
		double x = b * b - 4 * a * c;
		System.out.printf("%.1fx² + %.1fx + %.1f = 0 \n", a, b, c);
		if ((a == 0) && (b == 0)) {
			System.out.println("Co vo so nghiem");
		} else if ((a == 0) && (b != 0)) {
			System.out.println("Vo nghiem");
		} else if (a != 0) {
			if (x < 0) {
				System.out.println("Vo nghiem");
			} else if (x == 0) {
				System.out.println("Nghiem kep x = " + -b / (2 * a));
			} else {
				System.out.println("Co 2 nghiem rieng biet: " + (-b + Math.sqrt(x)) / (2 * a) + " va "
						+ (-b - Math.sqrt(x)) / (2 * a));
			}
		}
		scanner.close();
	}
}
