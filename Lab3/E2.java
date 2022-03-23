package Lab3;

import java.util.*;

public class E2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(str + "|");
		str = E2.getImage(str);
		System.out.println(str);
		sc.close();
	}

	public static String getImage(String arr) {
		String s1 = "";
		int n = arr.length();
		while (n > 0) {
			s1 += arr.charAt(n-1);
			n -= 1;
		}
		return s1;
	}
}
