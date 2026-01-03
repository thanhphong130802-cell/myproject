package Test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name: ");
		String Name = scanner.nextLine();
		System.out.println("Score: ");
		int Score = scanner.nextInt();
		System.out.println(Name + " co diem = " + Score);
		scanner.close();
	}
}
