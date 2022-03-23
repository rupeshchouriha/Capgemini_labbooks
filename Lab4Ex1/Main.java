package Lab4Ex1;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Account obj1 = new Account();
		Account obj2 = new SavingAccount();
		Account obj3 = new currentAccount();

		obj1.setName("Smith");
		obj1.setAccNum(201834435665L);
		obj1.setAge(21);
		obj1.setBalance(2000);

		obj2.setName("Kathy");
		obj2.setAccNum(201586754321L);
		obj2.setAge(19);
		obj2.setBalance(3000);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Ammount You Want to Deposit : ");
		int depositAmmount = sc.nextInt();
		obj1.deposit(depositAmmount);
		System.out.println(obj1.getBalance());

		System.out.println("Enter Ammount You Want to withdrawn : ");
		int withdrawAmmount = sc.nextInt();
		obj2.withdraw(withdrawAmmount);
		obj3.withdraw(withdrawAmmount);
		System.out.println(obj2.getBalance());

		System.out.println("Smith's Current Balance : " + obj1.getBalance());

		System.out.println("Kathy's Current Balance : " + obj2.getBalance());

		sc.close();
	}
}
