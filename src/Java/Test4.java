package Java;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tax : ");
		int Tax = scanner.nextInt();
		if (Tax < 10) {
			System.out.println("Khong dong thue");
		} else if (10 <= Tax && Tax <= 15) {
			System.out.println("Thue 10%");
		} else if (15 < Tax && Tax <= 30) {
			System.out.println("Thue 20%");
		} else {
			System.out.println("Thue 50%");
		}
		scanner.close();
	}
}
