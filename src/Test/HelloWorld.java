package Test;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First number : ");
		int Firstnumber = scanner.nextInt();
		System.out.println("Second number : ");
		int Secondnumber = scanner.nextInt();
		System.out.println("Max : " + Math.max(Firstnumber, Secondnumber));
		scanner.close();
	}
}
