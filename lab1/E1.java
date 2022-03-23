package lab1;

import java.util.Scanner;

public class E1 {
	
	public static int sumOfSeries(int n)
    {
        int sum = 0;
        for (int x=1; x<=n; x++)
            sum += x*x*x;
        return sum;
    }
  

    public static void main(String[] args)
    
    {
    	Scanner sc = new Scanner(System.in);
    	
        int n = sc.nextInt();
        sc.close();
        
        System.out.println(sumOfSeries(n));
  
    }

}
