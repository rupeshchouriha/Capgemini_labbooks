package cg.feb18.spring.labbook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.feb18.spring.labbook.model.Employee;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee obj = context.getBean("employee", Employee.class);
		
		System.out.println("Employee Details -- ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(obj.toString());

		((AbstractApplicationContext) context).close();
	}
}
