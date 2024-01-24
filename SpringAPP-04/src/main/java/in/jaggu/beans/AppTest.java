package in.jaggu.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		
		UserService user = context.getBean(UserService.class);

		System.out.println(user.hashCode());

		UserService user1 = context.getBean(UserService.class);

		System.out.println(user1.hashCode());

	}
}
