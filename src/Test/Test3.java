package Test;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Do dai canh cua khoi lap phuong = ");
		int Legth = scanner.nextInt();
		System.out.println("The tich = " + Math.pow(Legth, 3));
		scanner.close();
	}
}
