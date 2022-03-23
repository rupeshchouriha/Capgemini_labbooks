package lab1;

import java.util.Scanner;

public class E5 {

	public static int calculateSum(int n) {
		int item = 1;
		int sum = 0;
		while (item <= n) {
			if (item % 3 == 0 || item % 5 == 0) {
				sum += item;
				item += 1;
			} else {
				item += 1;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(calculateSum(num));
		sc.close();
	}

}
