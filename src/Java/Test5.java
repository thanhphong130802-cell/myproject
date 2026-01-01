package Java;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a = ");
		int a = scanner.nextInt();
		System.out.println("b = ");
		int b = scanner.nextInt();
		System.out.printf("%dx + %d = 0 \n", a, b);
		if ((a == 0) && (b == 0)) {
			System.out.println("Co vo so nghiem");
		} else if ((a == 0) && (b != 0)) {
			System.out.println("Vo nghiem");
		} else {
			float x = (float) -b / a;
			System.out.println("x = " + x);
		}
		scanner.close();
	}
}
