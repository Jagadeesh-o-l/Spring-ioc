package spring_ioc_setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver {
public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("di.xml");
	 Employee em=(Employee) ac.getBean("emp");
	 System.out.println(em);
}
}
