package Lab2;

import java.util.*;

public class E2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] l = new String[n];
		String[] list = new String[n];
		for (int i = 0; i < l.length; i++) {
			l[i] = sc.next();
		}
		list = E2.sortStrings(l);
		if (list.length % 2 != 0) {
			for (int i = 0; i < list.length / 2 + 1; i++) {
				System.out.print(list[i].toUpperCase() + " ");
			}
			for (int j = list.length / 2 + 1; j < list.length; j++) {
				System.out.print(list[j].toLowerCase() + " ");
			}
		} else {
			for (int i = 0; i < list.length / 2; i++) {
				System.out.print(list[i].toUpperCase() + " ");
			}
			for (int j = list.length / 2; j < list.length; j++) {
				System.out.print(list[j].toLowerCase() + " ");
			}
		}
		sc.close();
	}

	public static String[] sortStrings(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

}
