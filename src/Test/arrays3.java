package Test;

public class arrays3 {
	public static void main(String[] args) {
		int[] a = { 2, 7, 11, 15 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 9) {
					System.out.printf("%d + %d = 9", a[i], a[j]);
					return;
				}
			}
		}
	}
}