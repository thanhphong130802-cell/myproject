package Java;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bang cuu chuong cua : ");
		int a = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d\t ", a, i, a * i);
		}
		scanner.close();
	}
}
