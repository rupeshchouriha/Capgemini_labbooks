package Lab2;

import java.util.*;

public class E4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < list.length; i++) {
			list[i] = sc.nextInt();
		}
		int h = modifyArray(list, n);
		Arrays.sort(list);
		h = h - 1;
		while (h >= 0) {
			System.out.print(list[h] + " ");
		}
		sc.close();

	}

	public static int modifyArray(int array[], int n) {
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (array[i] != array[i + 1]) {
				temp[j++] = array[i];
			}
		}
		temp[j++] = array[n - 1];
		for (int i = 0; i < j; i++) {
			array[i] = temp[i];
		}
		return j;
	}
}
