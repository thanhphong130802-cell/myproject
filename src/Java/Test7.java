package Java;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Electricity bill : ");
		int a = scanner.nextInt();
		if (a >= 0 && a <= 100) {
			System.out.println("Bill : " + a * 1000);
		} else {
			System.out.println("Bill : " + ((100 * 1000) + (a - 100) * 1500));
		}
	}
}
