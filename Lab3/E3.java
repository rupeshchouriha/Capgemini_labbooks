package Lab3;

import java.util.*;

public class E3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(E3.alterString(s));
		sc.close();
	}

	public static String alterString(String str) {

		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				s1 += str.charAt(i);

				System.out.println(s1);
			} else {
				int m = str.charAt(i);
				m += 1;
				s1 += (char) (m);
				System.out.println(s1);
			}
		}
		System.out.println(s1);
		return s1;
	}

}
