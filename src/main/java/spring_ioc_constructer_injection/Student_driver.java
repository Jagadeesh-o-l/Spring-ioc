package spring_ioc_constructer_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext acc= new ClassPathXmlApplicationContext("di.xml");
	Student sc= (Student)acc.getBean("s");
	System.out.println(sc);

	}

}
