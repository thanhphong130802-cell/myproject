package Test;

import java.util.Arrays;
import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So luong phan tu : ");
		int n = sc.nextInt();
		int[] mang = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1) + ":");
			mang[i] = sc.nextInt();
		}
		System.out.println("Mang vua nhap : " + Arrays.toString(mang));
		int max = mang[0];
		for (int a = 1; a < n; a++) {
			if (mang[a] > max) {
				max = mang[a];
			}
		}
		System.out.println("Max = " + max);
		int min = mang[0];
		for (int a = 1; a < n; a++) {
			if (mang[a] < min) {
				min = mang[a];
			}
		}
		System.out.println("Min = " + min);
		Arrays.sort(mang);
		System.out.println("Gia tri tang dan la : " + Arrays.toString(mang));
		sc.close();
	}
}