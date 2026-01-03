package Java;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap 1 so : ");
		int a = scanner.nextInt();
		int count = 0;
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				System.out.println("Uoc so khac : " + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to", a);
		} else {
			System.out.printf("%d khong phai so nguyen to", a);
		}
		scanner.close();
	}
}
