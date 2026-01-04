package Test;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu : ");
		int a = sc.nextInt();
		int[] mang = new int[a];
		System.out.println("Nhap so nguyen :");
		for (int i = 0; i < a; i++) {
			mang[i] = sc.nextInt();
		}
		Arrays.sort(mang);
		System.out.println("Mang sau khi sap xep : " + Arrays.toString(mang));
		sc.close();
	}
}