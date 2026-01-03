package Test;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		int z = scanner.nextInt();
		if (z == 1) {
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
		} else if (z == 2) {
			System.out.println("d =, ");
			double d = scanner.nextInt();
			System.out.println("e = ,");
			double e = scanner.nextInt();
			System.out.println("c = ,");
			double c = scanner.nextInt();
			double t = d * d - 4 * e * c;
			System.out.printf("%.1fx² + %.1fx + %.1f = 0 \n", d, e, c);
			if ((d == 0) && (e == 0)) {
				System.out.println("Co vo so nghiem");
			} else if ((d == 0) && (e != 0)) {
				System.out.println("Vo nghiem");
			} else if (d != 0) {
				if (t < 0) {
					System.out.println("Vo nghiem");
				} else if (t == 0) {
					System.out.println("Nghiem kep x = " + -e / (2 * d));
				} else {
					System.out.println("Co 2 nghiem rieng biet: " + (-e + Math.sqrt(t)) / (2 * d) + " va "
							+ (-e - Math.sqrt(t)) / (2 * d));
				}
			}
		} else if (z == 3) {
			System.out.println("Electricity bill : ");
			int j = scanner.nextInt();
			if (j >= 0 && j <= 100) {
				System.out.println("Bill : " + j * 1000);
			} else {
				System.out.println("Bill : " + ((100 * 1000) + (j - 100) * 1500));
			}
		} else if (z == 4) {
			System.out.println("Kết thúc");
			scanner.close();
		}
	}

}
