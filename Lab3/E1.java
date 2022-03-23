package Lab3;

import java.util.*;

public class E1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers using comma - ");
		String input = sc.nextLine();
		System.out.println(input);

		StringTokenizer tokenizer = new StringTokenizer(input);
		int num = 0, sum = 0;
		while (tokenizer.hasMoreTokens()) {
			String str = tokenizer.nextToken();
			num = Integer.parseInt(str);
			System.out.print(num + " ");
			sum += num;
		}
		System.out.println();

		System.out.println(sum);
		sc.close();
	}

}
