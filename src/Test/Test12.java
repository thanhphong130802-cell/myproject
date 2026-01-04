package Test;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		System.out.println("ax + b = 0");
		Scanner sc = new Scanner(System.in);
		System.out.println("a = ");
		int a = sc.nextInt();
		System.out.println("b = ");
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Vo nghiem");
		} else {
			double x = (double) -b / a;
			System.out.printf("%dx + %d = 0, Co nghiem x = %.2f\n", a, b, x);
		}
		sc.close();
	}
}
