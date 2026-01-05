package Test;

public class arrays4 {
	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 3, 12 };
		int pos = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				a[pos] = a[i];
				pos++;

			}
		}
		for (int i = pos; i < a.length; i++) {
			a[i] = 0;
		}
		System.out.println("Ket qua: ");
		for (int x : a) {
			System.out.println(x + " ");
		}
	}
}