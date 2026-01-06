package Test;

import java.util.Arrays;
import java.util.Scanner;

public class arrays4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So luong phan tu: ");
		int a = sc.nextInt();
		int[] i = new int[a];
		System.out.println("Nhap cac so nguyen: ");
		for (int x = 0; x < a; x++) {
			i[x] = sc.nextInt();
		}
		System.out.println("Cac so nguyen ban nhap vao la :" + Arrays.toString(i));
		sc.close();
	}
}
