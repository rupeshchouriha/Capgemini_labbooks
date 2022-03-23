package Lab3;

import java.util.*;

public class E8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int flag = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			int m = s.charAt(i);
			int n = s.charAt(i + 1);
			if (m < n) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Positive String");
		else
			System.out.println("Not a positive String");
		sc.close();
	}
}
