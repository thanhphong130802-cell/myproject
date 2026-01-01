package Java;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chieu dai = ");
		int Chieudai = scanner.nextInt();
		System.out.println("Chieu rong = ");
		int Chieurong = scanner.nextInt();
		System.out.println("Chu vi = " + (Chieudai + Chieurong) * 2);
		System.out.println("Dien tich = " + Chieudai * Chieurong);
		System.out.println("Canh nho nhat = " + Math.min(Chieudai, Chieurong));
	}
}
