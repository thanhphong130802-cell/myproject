package Test;

import java.util.Scanner;

public class arrays1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap 1 so nguyen : ");
		int a = sc.nextInt();
		int count = 0;
		for (int i = 2; i <= a - 1; i++) {
			if (a % i == 0) {
				System.out.println("Uoc so khac : " + i);
				count++;
			}
		}
		if (count == 0) {
			System.out.printf("%d la so nguyen to ", a);
		} else {
			System.out.printf("%d khong phai la so nguyen to ", a);
		}
		sc.close();
	}
}
