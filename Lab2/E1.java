package Lab2;

import java.util.*;

public class E1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[n];
		for (int k = 0; k < l.length; k++) {
			l[k] = sc.nextInt();
		}
		int a = E1.getSecondSmallest(l);
		System.out.println(a);
		sc.close();
	}

	public static int getSecondSmallest(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[1];

	}
}
