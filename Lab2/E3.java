package Lab2;

import java.util.*;

public class E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		int[] list = new int[n];
		for (int i = 0; i < l.length; i++) {
			l[i] = sc.nextInt();
		}
		list = E3.getSorted(l, n);
		for (int a : list) {
			System.out.print(a + " ");
		}
		sc.close();
	}

	public static int[] getSorted(int[] arr, int n) {

		int[] ar = new int[n];
		int k = 0;
		for (int num : arr) {
			int sum = 0;
			while (num > 0) {
				int b = num % 10;
				sum = (sum * 10) + b;
				num = num / 10;
			}
			ar[k] = sum;
			k += 1;
		}

		Arrays.sort(ar);
		return ar;
	}

}
