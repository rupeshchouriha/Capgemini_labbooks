package Lab3;

import java.util.*;

public class E4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(E4.modifyNumber(num));
		sc.close();
	}

	public static int modifyNumber(int n) {
		String str = String.valueOf(n);
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == str.length() - 1) {
				char j = str.charAt(str.length() - 1);
				String p = String.valueOf(j);
				int k = Integer.parseInt(p);
				char t = str.charAt(0);
				String q = String.valueOf(t);
				int l = Integer.parseInt(q);
				int f = Math.abs(k - l);
				s1 += Integer.toString(f);

			} else {
				char j = str.charAt(i);
				String p = String.valueOf(j);
				int k = Integer.parseInt(p);
				char t = str.charAt(i + 1);
				String q = String.valueOf(t);
				int l = Integer.parseInt(q);
				int f = Math.abs(k - l);
				s1 += Integer.toString(f);
			}
		}

		int o = Integer.parseInt(s1);
		return o;
	}
}
