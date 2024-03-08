package Object_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car_driver {
 

public static void main(String[] args) {
	ApplicationContext ac= new ClassPathXmlApplicationContext("di.xml");
	      Car c= (Car)ac.getBean("car");
	      JK_tyre j=(JK_tyre)  ac.getBean("jk");
	     MRF_tyre mr= (MRF_tyre) ac.getBean("mrf");
	         c.setW(mr);
	         System.out.println(c);
}
}
