package cg.feb18.spring.labbook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cg.feb18.spring.labbook.model.Employee;
import cg.feb18.spring.labbook.model.Sbu;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp = context.getBean("employee", Employee.class);
		Sbu s = context.getBean("sbu", Sbu.class);

		System.out.println(emp.toString());
		System.out.println(s.toString());

		((AbstractApplicationContext) context).close();
	}
}
